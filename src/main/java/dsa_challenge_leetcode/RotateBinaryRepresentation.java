package dsa_challenge_leetcode;

public class RotateBinaryRepresentation {

   public  static void rotateBinaryRepresentation(int N, int D)
    {
        int x=16;
        int LEFT_POSITION = ((N<<D) | N>>(x-D)) & 0xFFFF;
        int RIGHT_POSITION =((N>>D) | N<<(x-D)) & 0xFFFF;
        System.out.println("Rotating LEFT by 2 positions in decimal: {}: " +LEFT_POSITION);
        System.out.println("Rotating RIGHT by 2 positions in decimal: {}: " +RIGHT_POSITION);

    }


    public static void main(String[] args){

        int N=28;
        int D=2;
        rotateBinaryRepresentation(N,D);


    }

}
