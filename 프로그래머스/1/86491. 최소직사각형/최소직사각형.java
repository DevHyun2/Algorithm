class Solution {
    public int solution(int[][] sizes) {
        int w = 0;
        int h = 0;
        
        for(int i = 0 ; i < sizes.length ; i++){
            int width = sizes[i][0];
            int height = sizes[i][1];
        
            if(width > height){
                w = Math.max(w, width);
                h = Math.max(h, height);
            } else {
                w = Math.max(w, height);
                h = Math.max(h, width);
            }
                
        }
        return w * h;
    }
}