using System.Collections.Generic;

namespace ConsoleApp3.Methods
{
    /// <summary>
    /// 722
    /// </summary>
    public class Leet722
    {
        public IList<string> Action()
        {
            //var source = new string[] { "/*Test program */", "int main()", "{ ", "  // variable declaration ", "int a, b, c;", "/* This is a test", "   multiline  ", "   comment for ", "   testing */", "a = b + c;", "}" };
            //var source = new string[] { "a/*comment", "line", "more_comment*/b" };
            var source = new string[] { "struct Node{", "    /*/ declare members;/**/", "    int size;", "    /**/int val;", "};" };

            return RemoveComments3(source);
        }

        public IList<string> RemoveComments(string[] source)
        {
            var result = new List<string>();
            //是否为段注释
            bool flag = false;
            foreach (var str in source)
            {
                //通过比较index匹配到的第一个注释符号
                int one = -1;
                int two = -1;
                int three = -1;
                if (!flag)
                {
                    one = str.IndexOf("//");
                    two = str.IndexOf("/*");
                    three = str.IndexOf("*/");
                }
                else
                {
                    three = str.IndexOf("*/");
                }

                if (!flag)
                {
                    //情况一：
                    //行注释先于段注释
                    //则忽略段注释
                    //返回行注释符号前面的字符串
                    if (one >= 0 && (two < 0 || one < two))
                    {
                        var s = str.Substring(0, one);
                        if (s.Length > 0)
                        {
                            result.Add(s);
                        }
                    }
                    //情况二：
                    //段注释先于行注释
                    //则忽略行注释
                    //查找结束符合
                    //如果没有则标记flag为true 返回注释符号前面的字符串
                    //如果有则字符串截取注释区间之外的字符串
                    else if (two >= 0 && (one < 0 || two < one))
                    {
                        if (three > 0)
                        {
                            // 特殊情况 "/*/"
                            string s = "";
                            s = str.Substring(0, two) + str.Substring(two + 2);

                            if (s.Length > 0)
                            {
                                result.Add(s);
                            }
                        }
                        else
                        {
                            var s = str.Substring(0, two);
                            if (s.Length > 0)
                            {
                                result.Add(s);
                            }
                            flag = true;
                        }
                    }
                    else
                    {
                        result.Add(str);
                    }
                }
                else
                {
                    if (three > 0)
                    {
                        var s = str.Substring(three + 2);
                        if (s.Length > 0)
                        {
                            result[result.Count - 1] += s;
                        }
                        flag = false;
                    }
                }
            }
            return result;
        }

        public IList<string> RemoveComments2(string[] source)
        {
            var result = new List<string>();
            bool flag = false;
            bool last = false;
            foreach (var str in source)
            {
                bool done = false;
                string s = string.Empty;
                last = false;
                for (int i = 0; i < str.Length; i++)
                {
                    if (done) break;
                    if (str[i] == '/')
                    {
                        if (i + 1 != str.Length && str[i + 1] == '/')
                        {
                            done = true;
                        }
                        else if (i + 1 != str.Length && str[i + 1] == '*')
                        {
                            flag = true;
                        }
                        continue;
                    }
                    else if (str[i] == '*')
                    {
                        if (+1 != str.Length && str[i + 1] == '/')
                        {
                            flag = false;
                            continue;
                        }
                    }
                    if (!flag)
                    {
                        if (i > 1 && str[i - 1] == '/')
                        {
                            last = true;
                        }

                        s += str[i];
                    }
                }
                if (s.Length > 0)
                {
                    if (last)
                    {
                        result[result.Count - 1] += s;
                    }
                    else
                    {
                        result.Add(s);
                    }
                }
            }

            return result;
        }

        public IList<string> RemoveComments3(string[] source)
        {
            var r = new List<string>();
            bool f = false;
            string ss = string.Empty;
            string se = string.Empty;
            foreach (var str in source)
            {
                string s = string.Empty;
                string sp = string.Empty;
                string ssse = string.Empty;
                foreach (var c in str)
                {
                    if (ss == string.Empty)
                    {
                        if (c == '/')
                        {
                            ss += c;
                            ssse += c;
                            continue;
                        }
                    }
                    else if (ss == "/")
                    {
                        if (c == '/')
                        {
                            ss = string.Empty;
                            break;
                        }
                        else if (c == '*')
                        {
                            ss += c;
                            ssse += c;
                            continue;
                        }
                    }
                    else if (ss == "/*")
                    {
                        if (se == "*" && c == '/')
                        {
                            if (ssse != "/**")
                                f = true;
                            ss = string.Empty;
                            se = string.Empty;
                            continue;
                        }
                        else if (se == string.Empty && c == '*')
                        {
                            se += c;
                            ssse += c;
                            continue;
                        }
                    }
                    if (ss != "/*")
                    {
                        if (f)
                        {
                            sp += c;
                        }
                        else
                        {
                            s += c;
                        }
                    }
                }
                if (s.Length > 0)
                {
                    if (f)
                    {
                        if (r.Count > 0)
                        {
                            r[r.Count - 1] += sp;
                            r.Add(s);
                        }
                        else
                        {
                            r.Add(s);
                            f = false;
                        }
                    }
                    else
                    {
                        r.Add(s);
                        f = false;
                    }
                }
                else
                {
                    if (f)
                    {
                        if (r.Count > 0)
                        {
                            r[r.Count - 1] += sp;
                        }
                    }
                    f = false;
                }
            }
            return r;
        }
    }
}