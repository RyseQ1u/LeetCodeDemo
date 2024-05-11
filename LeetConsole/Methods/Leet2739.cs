using ConsoleApp1.Class;
using System;
using System.Collections.Generic;
using System.ComponentModel.Design;
using System.Linq;
using System.Timers;

namespace ConsoleApp1.Methods
{
    public class Leet2739
    {
        public int Action()
        {
            int mainTank = 9, additionalTank = 2;
            //int mainTank = 5, additionalTank = 10;
            var r = DistanceTraveled(mainTank, additionalTank);

            return r;
        }

        public int DistanceTraveled(int mainTank, int additionalTank)
        {
            var r = 0;
            //商 触发加油的次数
            var quotient = 0;
            //余数 剩下的油
            var residue = 0;

            quotient = mainTank / 5;
            if (quotient > 0)
            {
                residue = mainTank % 5;
            }
            //副油箱油不够的情况
            if(quotient > additionalTank)
            {
                if (additionalTank + residue >= 5)
                {
                    var q = (additionalTank + residue) / 5;
                    var re = (additionalTank + residue) % 5;
                    r = mainTank + additionalTank + q + re;
                }
                else
                {
                    r = mainTank + quotient;
                }

            }
            else
            {
                if (quotient + residue >= 5)
                {
                    var q = (quotient + residue) / 5;
                    
                    var re = (quotient + residue) % 5;
                    r = mainTank + quotient + q + re;
                }
                else
                {
                    r = mainTank + quotient;
                }
            }



            return r * 10;
        }
    }
}