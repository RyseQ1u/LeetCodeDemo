using System.Collections.Generic;
using System.Security.Cryptography;
using System.Text;

namespace Leet.Methods
{
    /// <summary>
    ///
    /// </summary>
    public class Leet337
    {
        public int Action()
        {
            MyHashMap myHashMap = new MyHashMap();
            myHashMap.Put(1, 2);
            myHashMap.Put(2, 3);
            myHashMap.Put(3, 4);
            myHashMap.Get(2);

            return 1;
        }

        public class MyHashMap
        {
            public List<string> keys = new List<string>();
            public List<int> values = new List<int>();

            public MyHashMap()
            {
            }

            public static string CreateSHA256Hash(string input)
            {
                using (SHA256 sha256Hash = SHA256.Create())
                {
                    // Convert the input string to a byte array and compute the hash.
                    byte[] data = sha256Hash.ComputeHash(Encoding.UTF8.GetBytes(input));

                    // Convert byte array to a string
                    StringBuilder sBuilder = new StringBuilder();
                    for (int i = 0; i < data.Length; i++)
                    {
                        sBuilder.Append(data[i].ToString("x2"));
                    }
                    return sBuilder.ToString();
                }
            }

            public void Put(int key, int value)
            {
                var hsKey = CreateSHA256Hash(key.ToString());
                var exist = keys.IndexOf(hsKey);
                if (exist == -1)
                {
                    keys.Add(hsKey);
                    values.Add(value);
                }
                else
                {
                    values[exist] = value;
                }
            }

            public int Get(int key)
            {
                var hsKey = CreateSHA256Hash(key.ToString());
                var exist = keys.IndexOf(hsKey);
                if (exist == -1)
                {
                    return -1;
                }
                else
                {
                    return values[exist];
                }
            }

            public void Remove(int key)
            {
                var hsKey = CreateSHA256Hash(key.ToString());
                var exist = keys.IndexOf(hsKey);
                if (exist != -1)
                {
                    keys.RemoveAt(exist);
                    values.RemoveAt(exist);
                }
            }
        }
    }
}