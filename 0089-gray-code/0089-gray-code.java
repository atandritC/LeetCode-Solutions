class Solution {
    public List<Integer> grayCode(int n) {
        int range = (1 << n);
        List<Integer> gcSeq = new ArrayList<>();
        for (int i = 0; i < range; i++)
            gcSeq.add(i ^ (i >> 1));

        return gcSeq;
    }
}