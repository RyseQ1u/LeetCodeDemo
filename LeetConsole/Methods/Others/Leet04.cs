using System.Collections.Generic;

namespace ConsoleApp3.Methods
{
    public class Leet04
    {
        /// <summary>
        /// 1790
        /// </summary>
        /// <returns></returns>
        public bool Function1(string str1, string str2)
        {
            //bool result = false;

            List<char> cList = new List<char>();
            for (int i = 0; i < str1.Length; i++)
            {
                if (str1[i] != str2[i])
                {
                    if (cList.Count == 2)
                    {
                        if (cList[0] == str2[i] && cList[1] == str1[i])
                        {
                            return true;
                        }
                        else
                        {
                            return false;
                        }
                    }
                    else if (cList.Count > 2)
                    {
                        return false;
                    }
                    cList.Add(str1[i]);
                    cList.Add(str2[i]);
                }
            }

            return true;
        }
    }
}