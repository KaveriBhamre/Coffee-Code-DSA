class Solution {
    private enum Direction{ NORTH, SOUTH, EAST, WEST }

    public boolean isRobotBounded(String instructions) {
        int x = 0, y = 0;
        Direction dir = Direction.NORTH;

        for(char ch : instructions.toCharArray()) {
            if(ch == 'G') {
                switch(dir) {
                    case NORTH: y++; break;
                    case SOUTH: y--; break;
                    case EAST: x++; break;
                    case WEST: x--; break;
                }
            }else if( ch == 'L') {
                switch(dir) {
                    case NORTH: dir = Direction.WEST; break;
                    case SOUTH: dir = Direction.EAST; break;
                    case EAST: dir = Direction.NORTH; break;
                    case WEST: dir = Direction.SOUTH; break;
                }
            }else if(ch == 'R') {
                switch(dir) {
                    case NORTH: dir = Direction.EAST; break;
                    case SOUTH: dir = Direction.WEST; break;
                    case EAST: dir = Direction.SOUTH; break;
                    case WEST: dir = Direction.NORTH; break;
                }
            }
        }

        if(x == 0 && y == 0) return true;
        if(dir == Direction.NORTH) return false;

        return true;
    }
}