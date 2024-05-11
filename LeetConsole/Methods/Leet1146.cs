using System;
using System.Collections.Generic;

namespace ConsoleApp1.Methods
{
    public class Leet1146
    {
        public int Action()
        {
            var r = 0;
            var sa = new SnapshotArray(3);
            sa.Set(0, 5);
            sa.Snap();
            sa.Set(0, 6);
            sa.Get(0, 0);
            return r;
        }
    }

    public class SnapshotArray
    {
        private Dictionary<int, List<int[]>> data;
        private int snap;

        public SnapshotArray(int length)
        {
            data = new Dictionary<int, List<int[]>>();
        }

        public void Set(int index, int val)
        {
            if (data.ContainsKey(index))
            {
                data[index].Add(new int[] { snap, val });
            }
            else
            {
                data.Add(index, new List<int[]>() { new int[] { snap, val } });
            }
        }

        public int Snap()
        {
            return snap++;
        }

        public int Get(int index, int snap_id)
        {
            if (data.ContainsKey(index))
            {
                //找不到snap的时候尝试往前找
                while (snap_id > -1)
                {
                    var f = data[index].FindLast(p => p[0] == snap_id);
                    if (f != null)
                    {
                        return f[1];
                    }
                    else if (snap_id == 0)
                    {
                        return 0;
                    }
                    snap_id--;
                }
                return 0;
            }
            else
            {
                return 0;
            }
        }
    }
}