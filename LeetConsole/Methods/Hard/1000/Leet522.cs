using System.Collections.Generic;
using System.Numerics;

namespace LeetCode.Methods.Hard
{
    /// <summary>
    /// 552 todo
    /// </summary>
    public class Leet552
    {
        public int Action()
        {
            //8
            int n = 2;
            return CheckRecord(n);
        }

        private static Dictionary<(int, int), BigInteger> combinationCache = new Dictionary<(int, int), BigInteger>();
        private BigInteger Modulo = 1000000007;

        public int CheckRecord(int n)
        {
            int mod = 1000000007;
            return (int)CalculateValidCombinations(n);
        }

        public BigInteger CalculateValidCombinations(int n)
        {
            BigInteger totalCombinations = BigInteger.ModPow(3, n, Modulo);

            // Remove combinations with two or more 'a's
            totalCombinations = ModSub(totalCombinations, CountCombinationsWithAtLeastKAs(n, 2), Modulo);

            // Remove combinations with three or more consecutive 'l's
            totalCombinations = ModSub(totalCombinations, CountCombinationsWithAtLeastKConsecutiveLs(n, 3), Modulo);

            return totalCombinations;
        }

        private BigInteger CountCombinationsWithAtLeastKAs(int n, int k)
        {
            BigInteger count = 0;
            for (int i = k; i <= n; i++)
            {
                count = ModAdd(count, ModMult(GetCombinations(n, i), BigInteger.ModPow(2, n - i, Modulo), Modulo), Modulo);
            }
            return count;
        }

        private BigInteger CountCombinationsWithAtLeastKConsecutiveLs(int n, int k)
        {
            BigInteger count = 0;
            for (int i = k; i <= n; i++)
            {
                count = ModAdd(count, ModSub(ModMult(GetCombinations(n - k + 1, 1), BigInteger.ModPow(3, n - k, Modulo), Modulo), ModMult(GetCombinations(n - k, 1), BigInteger.ModPow(2, n - k - 1, Modulo), Modulo), Modulo), Modulo);
            }
            return count;
        }

        private BigInteger GetCombinations(int n, int k)
        {
            if (k == 0 || k == n) return 1;
            if (k == 1) return n;
            if (combinationCache.TryGetValue((n, k), out BigInteger cachedResult))
                return cachedResult;
            BigInteger result = ModMult(GetCombinations(n - 1, k - 1), n, Modulo);
            result = ModSub(result, ModMult(GetCombinations(n - 1, k), n - k, Modulo), Modulo);
            combinationCache[(n, k)] = result;
            return result;
        }

        private BigInteger ModAdd(BigInteger a, BigInteger b, BigInteger mod)
        {
            return (a + b) % mod;
        }

        private BigInteger ModSub(BigInteger a, BigInteger b, BigInteger mod)
        {
            return (a - b + mod) % mod;
        }

        private BigInteger ModMult(BigInteger a, BigInteger b, BigInteger mod)
        {
            return (a * b) % mod;
        }

        private BigInteger ModDiv(BigInteger a, BigInteger b, BigInteger mod)
        {
            return ModMult(a, BigInteger.ModPow(b, mod - 2, mod), mod);
        }
    }
}