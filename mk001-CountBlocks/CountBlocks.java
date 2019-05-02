public class CountBlocks {    
    /**
     * Returns total number of blocks required to build a pyramide, for given number
     * of pyramide levels.
     * <p>
     * @param levels: Number of pyramide levels.
     * @return blockCount: Total number of blocks required to build the pyramide.
     */
    public static int countBlocks(int levels){
        int blockCount = 0; 
        for (int i = 1; i <= levels; i++) {
            blockCount = blockCount + (i*i);
        }
        return blockCount;
    }

    public static void main(String[] args) {
        System.out.println(countBlocks(8));
    }
}
