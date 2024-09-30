using LeetCode.Class;

namespace LeetCode.Methods.Middle
{
    /// <summary>
    /// 1845
    /// </summary>
    public class Leet1845
    {
        public bool Test()
        {
            var sm = new SeatManager(3);
            sm.Reserve();
            sm.Reserve();
            sm.Unreserve(1);
            sm.Unreserve(2);
            sm.Reserve();
            sm.Unreserve(1);
            sm.Reserve();
            sm.Unreserve(1);
            return true;
        }

        public bool Test2()
        {
            var sm = new SeatManager(5);
            sm.Reserve();
            sm.Reserve();
            sm.Unreserve(2);
            sm.Reserve();
            sm.Reserve();
            sm.Reserve();
            sm.Reserve();

            sm.Unreserve(5);
            return true;
        }
    }
}