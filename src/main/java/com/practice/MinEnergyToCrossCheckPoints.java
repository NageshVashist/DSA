package com.practice;// Java program to find minimum
// initial energy to reach end

public class MinEnergyToCrossCheckPoints {

    // Function to calculate minimum
// initial energy arr[] stores energy
// at each checkpoints on street
    static int minInitialEnergy(int arr[], int n)
    {
        // initMinEnergy is variable to store
        // minimum initial energy required.
        int initMinEnergy = 0;

        // currEnergy is variable to store
        // current value of energy at
        // i'th checkpoint on street
        int currEnergy = 0;


        // Traverse each check point linearly
        for (int i = 0; i < n; i++) {
            currEnergy += arr[i];

            // If current energy, becomes negative or 0,
            // increment initial minimum energy by the negative
            // value plus 1. to keep current energy
            // positive (at least 1). Also
            // update current energy and flag.
            if (currEnergy <= 0) {
                initMinEnergy += Math.abs(currEnergy)+1;
                currEnergy = 1;
            }
        }

        // If energy never became negative or 0, then
        // return 1. Else return computed initMinEnergy
        return (initMinEnergy == 0) ? 1 : initMinEnergy;
    }


    public static void main(String[] args)
    {
//        int arr[] = {4, -10, 4, 4, 4};
//        int arr[] = {-1, -5, -9};
        int arr[] = {3, 5, 2, 6, 1};
        int n = arr.length;
        System.out.print(minInitialEnergy(arr, n));
    }
}


