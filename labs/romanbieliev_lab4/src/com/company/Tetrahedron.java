package com.company;

public class Tetrahedron {
    Vector3d vectorOne;
    Vector3d vectorTwo;
    Vector3d vectorThree;

    public Tetrahedron(Vector3d vectorOne, Vector3d vectorTwo, Vector3d vectorThree) {
        this.vectorOne = vectorOne;
        this.vectorTwo = vectorTwo;
        this.vectorThree = vectorThree;
    }

    public double calculateVolume() {
        double res = 0;

        Vector3d newVector = Vector3d.staticVectorMultiply(vectorOne, vectorTwo);
        res = Math.abs(Vector3d.staticScalarMultiply(newVector, vectorThree)) / 6;

        return res;
    }

    public void print() {
        double volume = calculateVolume();

        System.out.printf("Tetrahedron volume: %.2f\n", volume);
        System.out.println(vectorOne.toString());
        System.out.println(vectorTwo.toString());
        System.out.println(vectorThree.toString());
    }
}
