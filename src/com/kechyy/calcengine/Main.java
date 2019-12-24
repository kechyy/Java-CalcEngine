package com.kechyy.calcengine;

public class Main {

    public static void main(String[] args) {
	// write your code here
        double[] leftVals = {100.0d, 25.0d, 225.0d, 11.0d };
        double [] rightVals = { 50.0d, 92.0d, 17.0d, 3.0d };
        char[] opCodes = { 'd', 'a', 's', 'm' };
        double[] results = new double[opCodes.length];
        for(int i = 0; i < opCodes.length; i++) {
            if(opCodes[i] == 'a')
                results[i] = leftVals[i] + rightVals[i];
            else if(opCodes[i] == 's'){
                results[i] = leftVals[i] - rightVals[i];
            }
            else if(opCodes[i] == 'm'){
                results[i] = leftVals[i] * rightVals[i];
            }
            else {
                System.out.println("Error- Invalid opCode");
                results[i] = 0.0d;
            }

            for(double theResult: results) {
                System.out.println(theResult);
            }
            for(int x = 0; x< opCodes.length; x++) {
                switch(opCodes[x]) {
                    case 'a':
                        results[x] = leftVals[x] + rightVals[x];
                        break;
                    case 's':
                        results[x] = leftVals[i] - rightVals[x];
                        break;
                    case 'm':
                        results[x] = leftVals[i] * rightVals[x];
                        break;
                    case 'd':
                        results[x] = leftVals[x] / rightVals[x];
                        break;
                    default:
                        System.out.println("Error!- Invalid Opcode");

                }
            }

        }
    }
}
