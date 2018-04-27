public class ArithmeticProgression
{
	public int missingNumber(int arr[])
	{
		int len = arr.length;
		int beg = 0;
		int end = len - 1;
		int diff = (arr[end] - arr[beg]) / len;
		while (beg <= end)
		{
			int mid = (beg + end) / 2;
			if (arr[mid] > arr[0] + (mid * diff) && arr[mid - 1] == arr[0] + (mid - 1) * diff)
			{
				return arr[0] + mid * diff;
			}
			else if (arr[mid] == arr[0] + (mid * diff))
				beg = mid + 1;
			else
				end = mid - 1;
		}

		return -1;
	}

	public static void main(String args[])
	{
		int arr1[] = { 1, 3, 7, 9, 11, 13 };
		int arr2[] = { 2, 4, 8, 10, 12, 14 };
		int arr3[] = { 1, 6, 11, 16, 21, 31 };
		ArithmeticProgression obj = new ArithmeticProgression();
		int x = obj.missingNumber(arr1);
		System.out.println(x);
		x = obj.missingNumber(arr2);
		System.out.println(x);
		x = obj.missingNumber(arr3);
		System.out.println(x);
	}
}