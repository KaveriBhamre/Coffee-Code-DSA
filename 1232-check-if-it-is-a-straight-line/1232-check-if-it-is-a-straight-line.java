class Solution {
    public boolean checkStraightLine(int[][] cord) {
        if(cord.length == 2) {
            return true;
        }
        int x0 = cord[0][0]; int y0 = cord[0][1];
        int x1 = cord[1][0]; int y1 = cord[1][1];

        int delX = x1 - x0;
        int delY = y1 - y0;

        for(int i = 2; i < cord.length; i++) {
            int xi = cord[i][0]; int yi = cord[i][1];
            int delXi = xi - x0;
            int delYi = yi - y0;
            if(delX * delYi != delY * delXi) {
                return false;
            }
        }
        return true;
    }
}