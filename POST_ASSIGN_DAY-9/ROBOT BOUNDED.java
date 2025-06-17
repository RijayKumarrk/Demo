public class Solution {
    public boolean isRobotBounded(String instructions) {
        int[][] directions = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
        int x = 0, y = 0;
        int dir = 0;

        for (char ch : instructions.toCharArray()) {
            if (ch == 'G') {
                x += directions[dir][0];
                y += directions[dir][1];
            } else if (ch == 'L') {
                dir = (dir + 3) % 4;
            } else if (ch == 'R') {
                dir = (dir + 1) % 4;
            }
        }

        return (x == 0 && y == 0) || dir != 0;
    }

    public static void main(String[] args) {
        Solution robot = new Solution();
        System.out.println(robot.isRobotBounded("GGLLGG"));
        System.out.println(robot.isRobotBounded("GG"));
        System.out.println(robot.isRobotBounded("GL"));
    }
}
