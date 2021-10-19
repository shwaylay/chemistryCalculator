/*
 * Decompiled with CFR 0_118.
 */
import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class chemistryCalculatorByMichaelSuehle {
    public static void main(String[] args) {
        double min = 1000000.0;
        boolean n = false;
        Scanner sc = new Scanner(System.in);
        String H = "H";
        String He = "He";
        String Li = "Li";
        String Be = "Be";
        String B = "B";
        String C = "C";
        String N = "N";
        String O = "O";
        String F = "F";
        String Ne = "Ne";
        String Na = "Na";
        String Mg = "Mg";
        String Al = "Al";
        String Si = "Si";
        String P = "P";
        String S = "S";
        String Cl = "Cl";
        String Ar = "Ar";
        String K = "K";
        String Ca = "Ca";
        String Sc = "Sc";
        String Ti = "Ti";
        String V = "V";
        String Cr = "Cr";
        String Mn = "Mn";
        String Fe = "Fe";
        String Co = "Co";
        String Ni = "Ni";
        String Cu = "Cu";
        String Zn = "Zn";
        String Ga = "Ga";
        String Ge = "Ge";
        String As = "As";
        String Se = "Se";
        String Br = "Br";
        String Kr = "Kr";
        String Rb = "Rb";
        String Sr = "Sr";
        String Y = "Y";
        String Zr = "Zr";
        String Nb = "Nb";
        String Mo = "Mo";
        String Tc = "Tc";
        String Ru = "Ru";
        String Rh = "Rh";
        String Pd = "Pd";
        String Ag = "Ag";
        String Cd = "Cd";
        String In = "In";
        String Sn = "Sn";
        String Sb = "Sb";
        String Te = "Te";
        String I = "I";
        String Xe = "Xe";
        String Cs = "Cs";
        String Ba = "Ba";
        String La = "La";
        String Hf = "Hf";
        String Ta = "Ta";
        String W = "W";
        String Re = "Re";
        String Os = "Os";
        String Ir = "Ir";
        String Pt = "Pt";
        String Au = "Au";
        String Hg = "Hg";
        String Tl = "Tl";
        String Pb = "Pb";
        String Bi = "Bi";
        String Po = "Po";
        String At = "At";
        String Rn = "Rn";
        String Fr = "Fr";
        String Ra = "Ra";
        String Ac = "Ac";
        String Rf = "Rf";
        String Db = "Db";
        String Sg = "Sg";
        String Bh = "Bh";
        String Hs = "Hs";
        String Mt = "Mt";
        String Ce = "Ce";
        String Pr = "Pr";
        String Nd = "Nd";
        String Pm = "Pm";
        String Sm = "Sm";
        String Eu = "Eu";
        String Gd = "Gd";
        String Tb = "Tb";
        String Dy = "Dy";
        String Ho = "Ho";
        String Er = "Er";
        String Tm = "Tm";
        String Yb = "Yb";
        String Lu = "Lu";
        String Th = "Th";
        String Pa = "Pa";
        String U = "U";
        String Np = "Np";
        String Pu = "Pu";
        String Am = "Am";
        String Cm = "Cm";
        String Bk = "Bk";
        String Cf = "Cf";
        String Es = "Es";
        String Fm = "Fm";
        String Md = "Md";
        String No = "No";
        String Lr = "Lr";
        System.out.println("Which do you want to calculate?");
        System.out.println("Mass->Epirical Formula(0)");
        System.out.println("Atomic mass of an element(1)");
        System.out.println("Mass of known->Mass of unknown(2)");
        System.out.println("Molar mass(3)");
        System.out.println("This program was created by Michael Suehle.");
        int ans = Integer.parseInt(sc.nextLine());
        if (ans == 0) {
            int i;
            System.out.println("How many atoms in the compound?");
            int num = Integer.parseInt(sc.nextLine());
            int[] atom = new int[num];
            int[] amount = new int[num];
            int[] sub = new int[num];
            int[] index = new int[num];
            String[] element = new String[num];
            String[] mole3 = new String[num];
            double[] mass = new double[num];
            double[] mass2 = new double[num];
            double[] mole = new double[num];
            double[] mole2 = new double[num];
            String[] round = new String[num];
            for (i = 0; i < atom.length; ++i) {
                System.out.println("What is the symbol for atom:" + (i + 1) + "?");
                element[i] = sc.nextLine();
                System.out.println("What is the mass of atom:" + (i + 1) + "?");
                mass[i] = Double.parseDouble(sc.nextLine());
                if (element[i].equals(H)) {
                    mass2[i] = 1.0;
                    continue;
                }
                if (element[i].equals(He)) {
                    mass2[i] = 4.0;
                    continue;
                }
                if (element[i].equals(Li)) {
                    mass2[i] = 6.94;
                    continue;
                }
                if (element[i].equals(Be)) {
                    mass2[i] = 9.01;
                    continue;
                }
                if (element[i].equals(B)) {
                    mass2[i] = 10.81;
                    continue;
                }
                if (element[i].equals(C)) {
                    mass2[i] = 12.01;
                    continue;
                }
                if (element[i].equals(N)) {
                    mass2[i] = 14.01;
                    continue;
                }
                if (element[i].equals(O)) {
                    mass2[i] = 16.0;
                    continue;
                }
                if (element[i].equals(F)) {
                    mass2[i] = 19.0;
                    continue;
                }
                if (element[i].equals(Ne)) {
                    mass2[i] = 20.18;
                    continue;
                }
                if (element[i].equals(Na)) {
                    mass2[i] = 23.0;
                    continue;
                }
                if (element[i].equals(Mg)) {
                    mass2[i] = 24.3;
                    continue;
                }
                if (element[i].equals(Al)) {
                    mass2[i] = 27.0;
                    continue;
                }
                if (element[i].equals(Si)) {
                    mass2[i] = 28.09;
                    continue;
                }
                if (element[i].equals(P)) {
                    mass2[i] = 31.0;
                    continue;
                }
                if (element[i].equals(S)) {
                    mass2[i] = 32.07;
                    continue;
                }
                if (element[i].equals(Cl)) {
                    mass2[i] = 35.45;
                    continue;
                }
                if (element[i].equals(Ar)) {
                    mass2[i] = 39.94;
                    continue;
                }
                if (element[i].equals(K)) {
                    mass2[i] = 39.1;
                    continue;
                }
                if (element[i].equals(Ca)) {
                    mass2[i] = 40.08;
                    continue;
                }
                if (element[i].equals(Sc)) {
                    mass2[i] = 45.0;
                    continue;
                }
                if (element[i].equals(Ti)) {
                    mass2[i] = 47.87;
                    continue;
                }
                if (element[i].equals(V)) {
                    mass2[i] = 50.94;
                    continue;
                }
                if (element[i].equals(Cr)) {
                    mass2[i] = 52.0;
                    continue;
                }
                if (element[i].equals(Mn)) {
                    mass2[i] = 54.94;
                    continue;
                }
                if (element[i].equals(Fe)) {
                    mass2[i] = 55.85;
                    continue;
                }
                if (element[i].equals(Co)) {
                    mass2[i] = 58.93;
                    continue;
                }
                if (element[i].equals(Ni)) {
                    mass2[i] = 58.69;
                    continue;
                }
                if (element[i].equals(Cu)) {
                    mass2[i] = 63.55;
                    continue;
                }
                if (element[i].equals(Zn)) {
                    mass2[i] = 65.39;
                    continue;
                }
                if (element[i].equals(Ga)) {
                    mass2[i] = 69.72;
                    continue;
                }
                if (element[i].equals(Ge)) {
                    mass2[i] = 72.61;
                    continue;
                }
                if (element[i].equals(As)) {
                    mass2[i] = 74.92;
                    continue;
                }
                if (element[i].equals(Se)) {
                    mass2[i] = 78.96;
                    continue;
                }
                if (element[i].equals(Br)) {
                    mass2[i] = 79.9;
                    continue;
                }
                if (element[i].equals(Kr)) {
                    mass2[i] = 83.8;
                    continue;
                }
                if (element[i].equals(Rb)) {
                    mass2[i] = 85.47;
                    continue;
                }
                if (element[i].equals(Sr)) {
                    mass2[i] = 87.62;
                    continue;
                }
                if (element[i].equals(Y)) {
                    mass2[i] = 88.91;
                    continue;
                }
                if (element[i].equals(Zr)) {
                    mass2[i] = 91.22;
                    continue;
                }
                if (element[i].equals(Nb)) {
                    mass2[i] = 92.9;
                    continue;
                }
                if (element[i].equals(Mo)) {
                    mass2[i] = 95.94;
                    continue;
                }
                if (element[i].equals(Te)) {
                    mass2[i] = 98.0;
                    continue;
                }
                if (element[i].equals(Ru)) {
                    mass2[i] = 101.07;
                    continue;
                }
                if (element[i].equals(Rh)) {
                    mass2[i] = 102.9;
                    continue;
                }
                if (element[i].equals(Pd)) {
                    mass2[i] = 106.42;
                    continue;
                }
                if (element[i].equals(Ag)) {
                    mass2[i] = 107.87;
                    continue;
                }
                if (element[i].equals(Cd)) {
                    mass2[i] = 112.41;
                    continue;
                }
                if (element[i].equals(In)) {
                    mass2[i] = 114.82;
                    continue;
                }
                if (element[i].equals(Sn)) {
                    mass2[i] = 118.71;
                    continue;
                }
                if (element[i].equals(Sb)) {
                    mass2[i] = 121.76;
                    continue;
                }
                if (element[i].equals(Te)) {
                    mass2[i] = 127.6;
                    continue;
                }
                if (element[i].equals(I)) {
                    mass2[i] = 126.9;
                    continue;
                }
                if (element[i].equals(Xe)) {
                    mass2[i] = 131.29;
                    continue;
                }
                if (element[i].equals(Cs)) {
                    mass2[i] = 132.91;
                    continue;
                }
                if (element[i].equals(Ba)) {
                    mass2[i] = 137.33;
                    continue;
                }
                if (element[i].equals(La)) {
                    mass2[i] = 138.91;
                    continue;
                }
                if (element[i].equals(Hf)) {
                    mass2[i] = 178.49;
                    continue;
                }
                if (element[i].equals(Ta)) {
                    mass2[i] = 180.95;
                    continue;
                }
                if (element[i].equals(W)) {
                    mass2[i] = 183.84;
                    continue;
                }
                if (element[i].equals(Re)) {
                    mass2[i] = 186.21;
                    continue;
                }
                if (element[i].equals(Os)) {
                    mass2[i] = 190.23;
                    continue;
                }
                if (element[i].equals(Ir)) {
                    mass2[i] = 192.22;
                    continue;
                }
                if (element[i].equals(Pt)) {
                    mass2[i] = 195.08;
                    continue;
                }
                if (element[i].equals(Au)) {
                    mass2[i] = 196.97;
                    continue;
                }
                if (element[i].equals(Hg)) {
                    mass2[i] = 200.59;
                    continue;
                }
                if (element[i].equals(Tl)) {
                    mass2[i] = 204.38;
                    continue;
                }
                if (element[i].equals(Pb)) {
                    mass2[i] = 207.2;
                    continue;
                }
                if (element[i].equals(Bi)) {
                    mass2[i] = 208.98;
                    continue;
                }
                if (element[i].equals(Po)) {
                    mass2[i] = 209.0;
                    continue;
                }
                if (element[i].equals(At)) {
                    mass2[i] = 210.0;
                    continue;
                }
                if (element[i].equals(Rn)) {
                    mass2[i] = 222.0;
                    continue;
                }
                if (element[i].equals(Fr)) {
                    mass2[i] = 223.0;
                    continue;
                }
                if (element[i].equals(Ra)) {
                    mass2[i] = 226.0;
                    continue;
                }
                if (element[i].equals(Ac)) {
                    mass2[i] = 227.0;
                    continue;
                }
                if (element[i].equals(Rf)) {
                    mass2[i] = 261.0;
                    continue;
                }
                if (element[i].equals(Db)) {
                    mass2[i] = 262.0;
                    continue;
                }
                if (element[i].equals(Sg)) {
                    mass2[i] = 263.0;
                    continue;
                }
                if (element[i].equals(Bh)) {
                    mass2[i] = 262.0;
                    continue;
                }
                if (element[i].equals(Hs)) {
                    mass2[i] = 265.0;
                    continue;
                }
                if (element[i].equals(Mt)) {
                    mass2[i] = 266.0;
                    continue;
                }
                if (element[i].equals(Ce)) {
                    mass2[i] = 140.12;
                    continue;
                }
                if (element[i].equals(Pr)) {
                    mass2[i] = 140.91;
                    continue;
                }
                if (element[i].equals(Nd)) {
                    mass2[i] = 144.24;
                    continue;
                }
                if (element[i].equals(Pm)) {
                    mass2[i] = 145.0;
                    continue;
                }
                if (element[i].equals(Sm)) {
                    mass2[i] = 150.36;
                    continue;
                }
                if (element[i].equals(Eu)) {
                    mass2[i] = 151.96;
                    continue;
                }
                if (element[i].equals(Gd)) {
                    mass2[i] = 157.25;
                    continue;
                }
                if (element[i].equals(Tb)) {
                    mass2[i] = 158.93;
                    continue;
                }
                if (element[i].equals(Dy)) {
                    mass2[i] = 162.5;
                    continue;
                }
                if (element[i].equals(Ho)) {
                    mass2[i] = 164.93;
                    continue;
                }
                if (element[i].equals(Er)) {
                    mass2[i] = 167.26;
                    continue;
                }
                if (element[i].equals(Tm)) {
                    mass2[i] = 168.93;
                    continue;
                }
                if (element[i].equals(Yb)) {
                    mass2[i] = 173.04;
                    continue;
                }
                if (element[i].equals(Lu)) {
                    mass2[i] = 174.97;
                    continue;
                }
                if (element[i].equals(Th)) {
                    mass2[i] = 232.04;
                    continue;
                }
                if (element[i].equals(Pa)) {
                    mass2[i] = 231.04;
                    continue;
                }
                if (element[i].equals(U)) {
                    mass2[i] = 238.03;
                    continue;
                }
                if (element[i].equals(Np)) {
                    mass2[i] = 237.0;
                    continue;
                }
                if (element[i].equals(Pu)) {
                    mass2[i] = 244.0;
                    continue;
                }
                if (element[i].equals(Am)) {
                    mass2[i] = 243.0;
                    continue;
                }
                if (element[i].equals(Cm)) {
                    mass2[i] = 247.0;
                    continue;
                }
                if (element[i].equals(Bk)) {
                    mass2[i] = 247.0;
                    continue;
                }
                if (element[i].equals(Cf)) {
                    mass2[i] = 251.0;
                    continue;
                }
                if (element[i].equals(Es)) {
                    mass2[i] = 252.0;
                    continue;
                }
                if (element[i].equals(Fm)) {
                    mass2[i] = 257.0;
                    continue;
                }
                if (element[i].equals(Md)) {
                    mass2[i] = 258.0;
                    continue;
                }
                if (element[i].equals(No)) {
                    mass2[i] = 259.0;
                    continue;
                }
                if (element[i].equals(Lr)) {
                    mass2[i] = 262.0;
                    continue;
                }
                System.out.println("Wrong");
                break;
            }
            for (i = 0; i < atom.length; ++i) {
                mole[i] = mass[i] / mass2[i];
            }
            for (i = 0; i < atom.length; ++i) {
                if (mole[i] <= 0.0 || mole[i] >= min) continue;
                min = mole[i];
            }
            for (i = 0; i < atom.length; ++i) {
                mole2[i] = mole[i] / min;
            }
            for (i = 0; i < atom.length; ++i) {
                mole3[i] = Double.toString(mole2[i]);
                index[i] = mole3[i].indexOf(46);
                round[i] = mole3[i].substring(index[i] + 1, index[i] + 2);
                if (!round[i].equals("4") && !round[i].equals("5") && !round[i].equals("6")) continue;
                i = 0;
                while (i < atom.length) {
                    double[] arrd = mole2;
                    int n2 = i++;
                    arrd[n2] = arrd[n2] * 2.0;
                }
                break;
            }
            for (i = 0; i < atom.length; ++i) {
                System.out.print(element[i] + (int)(mole2[i] * 100.0 + 0.5) / 100);
            }
        } else if (ans == 1) {
            String ans2;
            do {
                double mass3;
                System.out.println("What is the symbol of the element?");
                String element1 = sc.nextLine();
                if (element1.equals(H)) {
                    mass3 = 1.0;
                } else if (element1.equals(He)) {
                    mass3 = 4.0;
                } else if (element1.equals(Li)) {
                    mass3 = 6.94;
                } else if (element1.equals(Be)) {
                    mass3 = 9.01;
                } else if (element1.equals(B)) {
                    mass3 = 10.81;
                } else if (element1.equals(C)) {
                    mass3 = 12.01;
                } else if (element1.equals(N)) {
                    mass3 = 14.01;
                } else if (element1.equals(O)) {
                    mass3 = 16.0;
                } else if (element1.equals(F)) {
                    mass3 = 19.0;
                } else if (element1.equals(Ne)) {
                    mass3 = 20.18;
                } else if (element1.equals(Na)) {
                    mass3 = 23.0;
                } else if (element1.equals(Mg)) {
                    mass3 = 24.3;
                } else if (element1.equals(Al)) {
                    mass3 = 27.0;
                } else if (element1.equals(Si)) {
                    mass3 = 28.09;
                } else if (element1.equals(P)) {
                    mass3 = 31.0;
                } else if (element1.equals(S)) {
                    mass3 = 32.07;
                } else if (element1.equals(Cl)) {
                    mass3 = 35.45;
                } else if (element1.equals(Ar)) {
                    mass3 = 39.94;
                } else if (element1.equals(K)) {
                    mass3 = 39.1;
                } else if (element1.equals(Ca)) {
                    mass3 = 40.08;
                } else if (element1.equals(Sc)) {
                    mass3 = 45.0;
                } else if (element1.equals(Ti)) {
                    mass3 = 47.87;
                } else if (element1.equals(V)) {
                    mass3 = 50.94;
                } else if (element1.equals(Cr)) {
                    mass3 = 52.0;
                } else if (element1.equals(Mn)) {
                    mass3 = 54.94;
                } else if (element1.equals(Fe)) {
                    mass3 = 55.85;
                } else if (element1.equals(Co)) {
                    mass3 = 58.93;
                } else if (element1.equals(Ni)) {
                    mass3 = 58.69;
                } else if (element1.equals(Cu)) {
                    mass3 = 63.55;
                } else if (element1.equals(Zn)) {
                    mass3 = 65.39;
                } else if (element1.equals(Ga)) {
                    mass3 = 69.72;
                } else if (element1.equals(Ge)) {
                    mass3 = 72.61;
                } else if (element1.equals(As)) {
                    mass3 = 74.92;
                } else if (element1.equals(Se)) {
                    mass3 = 78.96;
                } else if (element1.equals(Br)) {
                    mass3 = 79.9;
                } else if (element1.equals(Kr)) {
                    mass3 = 83.8;
                } else if (element1.equals(Rb)) {
                    mass3 = 85.47;
                } else if (element1.equals(Sr)) {
                    mass3 = 87.62;
                } else if (element1.equals(Y)) {
                    mass3 = 88.91;
                } else if (element1.equals(Zr)) {
                    mass3 = 91.22;
                } else if (element1.equals(Nb)) {
                    mass3 = 92.9;
                } else if (element1.equals(Mo)) {
                    mass3 = 95.94;
                } else if (element1.equals(Te)) {
                    mass3 = 98.0;
                } else if (element1.equals(Ru)) {
                    mass3 = 101.07;
                } else if (element1.equals(Rh)) {
                    mass3 = 102.9;
                } else if (element1.equals(Pd)) {
                    mass3 = 106.42;
                } else if (element1.equals(Ag)) {
                    mass3 = 107.87;
                } else if (element1.equals(Cd)) {
                    mass3 = 112.41;
                } else if (element1.equals(In)) {
                    mass3 = 114.82;
                } else if (element1.equals(Sn)) {
                    mass3 = 118.71;
                } else if (element1.equals(Sb)) {
                    mass3 = 121.76;
                } else if (element1.equals(Te)) {
                    mass3 = 127.6;
                } else if (element1.equals(I)) {
                    mass3 = 126.9;
                } else if (element1.equals(Xe)) {
                    mass3 = 131.29;
                } else if (element1.equals(Cs)) {
                    mass3 = 132.91;
                } else if (element1.equals(Ba)) {
                    mass3 = 137.33;
                } else if (element1.equals(La)) {
                    mass3 = 138.91;
                } else if (element1.equals(Hf)) {
                    mass3 = 178.49;
                } else if (element1.equals(Ta)) {
                    mass3 = 180.95;
                } else if (element1.equals(W)) {
                    mass3 = 183.84;
                } else if (element1.equals(Re)) {
                    mass3 = 186.21;
                } else if (element1.equals(Os)) {
                    mass3 = 190.23;
                } else if (element1.equals(Ir)) {
                    mass3 = 192.22;
                } else if (element1.equals(Pt)) {
                    mass3 = 195.08;
                } else if (element1.equals(Au)) {
                    mass3 = 196.97;
                } else if (element1.equals(Hg)) {
                    mass3 = 200.59;
                } else if (element1.equals(Tl)) {
                    mass3 = 204.38;
                } else if (element1.equals(Pb)) {
                    mass3 = 207.2;
                } else if (element1.equals(Bi)) {
                    mass3 = 208.98;
                } else if (element1.equals(Po)) {
                    mass3 = 209.0;
                } else if (element1.equals(At)) {
                    mass3 = 210.0;
                } else if (element1.equals(Rn)) {
                    mass3 = 222.0;
                } else if (element1.equals(Fr)) {
                    mass3 = 223.0;
                } else if (element1.equals(Ra)) {
                    mass3 = 226.0;
                } else if (element1.equals(Ac)) {
                    mass3 = 227.0;
                } else if (element1.equals(Rf)) {
                    mass3 = 261.0;
                } else if (element1.equals(Db)) {
                    mass3 = 262.0;
                } else if (element1.equals(Sg)) {
                    mass3 = 263.0;
                } else if (element1.equals(Bh)) {
                    mass3 = 262.0;
                } else if (element1.equals(Hs)) {
                    mass3 = 265.0;
                } else if (element1.equals(Mt)) {
                    mass3 = 266.0;
                } else if (element1.equals(Ce)) {
                    mass3 = 140.12;
                } else if (element1.equals(Pr)) {
                    mass3 = 140.91;
                } else if (element1.equals(Nd)) {
                    mass3 = 144.24;
                } else if (element1.equals(Pm)) {
                    mass3 = 145.0;
                } else if (element1.equals(Sm)) {
                    mass3 = 150.36;
                } else if (element1.equals(Eu)) {
                    mass3 = 151.96;
                } else if (element1.equals(Gd)) {
                    mass3 = 157.25;
                } else if (element1.equals(Tb)) {
                    mass3 = 158.93;
                } else if (element1.equals(Dy)) {
                    mass3 = 162.5;
                } else if (element1.equals(Ho)) {
                    mass3 = 164.93;
                } else if (element1.equals(Er)) {
                    mass3 = 167.26;
                } else if (element1.equals(Tm)) {
                    mass3 = 168.93;
                } else if (element1.equals(Yb)) {
                    mass3 = 173.04;
                } else if (element1.equals(Lu)) {
                    mass3 = 174.97;
                } else if (element1.equals(Th)) {
                    mass3 = 232.04;
                } else if (element1.equals(Pa)) {
                    mass3 = 231.04;
                } else if (element1.equals(U)) {
                    mass3 = 238.03;
                } else if (element1.equals(Np)) {
                    mass3 = 237.0;
                } else if (element1.equals(Pu)) {
                    mass3 = 244.0;
                } else if (element1.equals(Am)) {
                    mass3 = 243.0;
                } else if (element1.equals(Cm)) {
                    mass3 = 247.0;
                } else if (element1.equals(Bk)) {
                    mass3 = 247.0;
                } else if (element1.equals(Cf)) {
                    mass3 = 251.0;
                } else if (element1.equals(Es)) {
                    mass3 = 252.0;
                } else if (element1.equals(Fm)) {
                    mass3 = 257.0;
                } else if (element1.equals(Md)) {
                    mass3 = 258.0;
                } else if (element1.equals(No)) {
                    mass3 = 259.0;
                } else {
                    if (!element1.equals(Lr)) {
                        System.out.println("Wrong");
                        mass3 = 0.0;
                        break;
                    }
                    mass3 = 262.0;
                }
                System.out.println("The mass of " + element1 + " = " + mass3 + "g");
                System.out.println("Do you have another element?");
            } while ((ans2 = sc.nextLine()).equals("YES") || ans2.equals("yes") || ans2.equals("y") || ans2.equals("Y"));
        } else if (ans == 2) {
            int i;
            System.out.println("What is the mass of the known substance?");
            double knownmass = Double.parseDouble(sc.nextLine());
            System.out.println("What is the coefficient of the known substance?");
            double coefficient = Double.parseDouble(sc.nextLine());
            System.out.println("How many elements make up the known substance?");
            int num1 = Integer.parseInt(sc.nextLine());
            String[] element = new String[num1];
            double[] mass2 = new double[num1];
            double[] ss = new double[num1];
            for (int i2 = 0; i2 < element.length; ++i2) {
                System.out.println("What is element: " + (i2 + 1) + "?");
                element[i2] = sc.nextLine();
                if (element[i2].equals(H)) {
                    mass2[i2] = 1.0;
                } else if (element[i2].equals(He)) {
                    mass2[i2] = 4.0;
                } else if (element[i2].equals(Li)) {
                    mass2[i2] = 6.94;
                } else if (element[i2].equals(Be)) {
                    mass2[i2] = 9.01;
                } else if (element[i2].equals(B)) {
                    mass2[i2] = 10.81;
                } else if (element[i2].equals(C)) {
                    mass2[i2] = 12.01;
                } else if (element[i2].equals(N)) {
                    mass2[i2] = 14.01;
                } else if (element[i2].equals(O)) {
                    mass2[i2] = 16.0;
                } else if (element[i2].equals(F)) {
                    mass2[i2] = 19.0;
                } else if (element[i2].equals(Ne)) {
                    mass2[i2] = 20.18;
                } else if (element[i2].equals(Na)) {
                    mass2[i2] = 23.0;
                } else if (element[i2].equals(Mg)) {
                    mass2[i2] = 24.3;
                } else if (element[i2].equals(Al)) {
                    mass2[i2] = 27.0;
                } else if (element[i2].equals(Si)) {
                    mass2[i2] = 28.09;
                } else if (element[i2].equals(P)) {
                    mass2[i2] = 31.0;
                } else if (element[i2].equals(S)) {
                    mass2[i2] = 32.07;
                } else if (element[i2].equals(Cl)) {
                    mass2[i2] = 35.45;
                } else if (element[i2].equals(Ar)) {
                    mass2[i2] = 39.94;
                } else if (element[i2].equals(K)) {
                    mass2[i2] = 39.1;
                } else if (element[i2].equals(Ca)) {
                    mass2[i2] = 40.08;
                } else if (element[i2].equals(Sc)) {
                    mass2[i2] = 45.0;
                } else if (element[i2].equals(Ti)) {
                    mass2[i2] = 47.87;
                } else if (element[i2].equals(V)) {
                    mass2[i2] = 50.94;
                } else if (element[i2].equals(Cr)) {
                    mass2[i2] = 52.0;
                } else if (element[i2].equals(Mn)) {
                    mass2[i2] = 54.94;
                } else if (element[i2].equals(Fe)) {
                    mass2[i2] = 55.85;
                } else if (element[i2].equals(Co)) {
                    mass2[i2] = 58.93;
                } else if (element[i2].equals(Ni)) {
                    mass2[i2] = 58.69;
                } else if (element[i2].equals(Cu)) {
                    mass2[i2] = 63.55;
                } else if (element[i2].equals(Zn)) {
                    mass2[i2] = 65.39;
                } else if (element[i2].equals(Ga)) {
                    mass2[i2] = 69.72;
                } else if (element[i2].equals(Ge)) {
                    mass2[i2] = 72.61;
                } else if (element[i2].equals(As)) {
                    mass2[i2] = 74.92;
                } else if (element[i2].equals(Se)) {
                    mass2[i2] = 78.96;
                } else if (element[i2].equals(Br)) {
                    mass2[i2] = 79.9;
                } else if (element[i2].equals(Kr)) {
                    mass2[i2] = 83.8;
                } else if (element[i2].equals(Rb)) {
                    mass2[i2] = 85.47;
                } else if (element[i2].equals(Sr)) {
                    mass2[i2] = 87.62;
                } else if (element[i2].equals(Y)) {
                    mass2[i2] = 88.91;
                } else if (element[i2].equals(Zr)) {
                    mass2[i2] = 91.22;
                } else if (element[i2].equals(Nb)) {
                    mass2[i2] = 92.9;
                } else if (element[i2].equals(Mo)) {
                    mass2[i2] = 95.94;
                } else if (element[i2].equals(Te)) {
                    mass2[i2] = 98.0;
                } else if (element[i2].equals(Ru)) {
                    mass2[i2] = 101.07;
                } else if (element[i2].equals(Rh)) {
                    mass2[i2] = 102.9;
                } else if (element[i2].equals(Pd)) {
                    mass2[i2] = 106.42;
                } else if (element[i2].equals(Ag)) {
                    mass2[i2] = 107.87;
                } else if (element[i2].equals(Cd)) {
                    mass2[i2] = 112.41;
                } else if (element[i2].equals(In)) {
                    mass2[i2] = 114.82;
                } else if (element[i2].equals(Sn)) {
                    mass2[i2] = 118.71;
                } else if (element[i2].equals(Sb)) {
                    mass2[i2] = 121.76;
                } else if (element[i2].equals(Te)) {
                    mass2[i2] = 127.6;
                } else if (element[i2].equals(I)) {
                    mass2[i2] = 126.9;
                } else if (element[i2].equals(Xe)) {
                    mass2[i2] = 131.29;
                } else if (element[i2].equals(Cs)) {
                    mass2[i2] = 132.91;
                } else if (element[i2].equals(Ba)) {
                    mass2[i2] = 137.33;
                } else if (element[i2].equals(La)) {
                    mass2[i2] = 138.91;
                } else if (element[i2].equals(Hf)) {
                    mass2[i2] = 178.49;
                } else if (element[i2].equals(Ta)) {
                    mass2[i2] = 180.95;
                } else if (element[i2].equals(W)) {
                    mass2[i2] = 183.84;
                } else if (element[i2].equals(Re)) {
                    mass2[i2] = 186.21;
                } else if (element[i2].equals(Os)) {
                    mass2[i2] = 190.23;
                } else if (element[i2].equals(Ir)) {
                    mass2[i2] = 192.22;
                } else if (element[i2].equals(Pt)) {
                    mass2[i2] = 195.08;
                } else if (element[i2].equals(Au)) {
                    mass2[i2] = 196.97;
                } else if (element[i2].equals(Hg)) {
                    mass2[i2] = 200.59;
                } else if (element[i2].equals(Tl)) {
                    mass2[i2] = 204.38;
                } else if (element[i2].equals(Pb)) {
                    mass2[i2] = 207.2;
                } else if (element[i2].equals(Bi)) {
                    mass2[i2] = 208.98;
                } else if (element[i2].equals(Po)) {
                    mass2[i2] = 209.0;
                } else if (element[i2].equals(At)) {
                    mass2[i2] = 210.0;
                } else if (element[i2].equals(Rn)) {
                    mass2[i2] = 222.0;
                } else if (element[i2].equals(Fr)) {
                    mass2[i2] = 223.0;
                } else if (element[i2].equals(Ra)) {
                    mass2[i2] = 226.0;
                } else if (element[i2].equals(Ac)) {
                    mass2[i2] = 227.0;
                } else if (element[i2].equals(Rf)) {
                    mass2[i2] = 261.0;
                } else if (element[i2].equals(Db)) {
                    mass2[i2] = 262.0;
                } else if (element[i2].equals(Sg)) {
                    mass2[i2] = 263.0;
                } else if (element[i2].equals(Bh)) {
                    mass2[i2] = 262.0;
                } else if (element[i2].equals(Hs)) {
                    mass2[i2] = 265.0;
                } else if (element[i2].equals(Mt)) {
                    mass2[i2] = 266.0;
                } else if (element[i2].equals(Ce)) {
                    mass2[i2] = 140.12;
                } else if (element[i2].equals(Pr)) {
                    mass2[i2] = 140.91;
                } else if (element[i2].equals(Nd)) {
                    mass2[i2] = 144.24;
                } else if (element[i2].equals(Pm)) {
                    mass2[i2] = 145.0;
                } else if (element[i2].equals(Sm)) {
                    mass2[i2] = 150.36;
                } else if (element[i2].equals(Eu)) {
                    mass2[i2] = 151.96;
                } else if (element[i2].equals(Gd)) {
                    mass2[i2] = 157.25;
                } else if (element[i2].equals(Tb)) {
                    mass2[i2] = 158.93;
                } else if (element[i2].equals(Dy)) {
                    mass2[i2] = 162.5;
                } else if (element[i2].equals(Ho)) {
                    mass2[i2] = 164.93;
                } else if (element[i2].equals(Er)) {
                    mass2[i2] = 167.26;
                } else if (element[i2].equals(Tm)) {
                    mass2[i2] = 168.93;
                } else if (element[i2].equals(Yb)) {
                    mass2[i2] = 173.04;
                } else if (element[i2].equals(Lu)) {
                    mass2[i2] = 174.97;
                } else if (element[i2].equals(Th)) {
                    mass2[i2] = 232.04;
                } else if (element[i2].equals(Pa)) {
                    mass2[i2] = 231.04;
                } else if (element[i2].equals(U)) {
                    mass2[i2] = 238.03;
                } else if (element[i2].equals(Np)) {
                    mass2[i2] = 237.0;
                } else if (element[i2].equals(Pu)) {
                    mass2[i2] = 244.0;
                } else if (element[i2].equals(Am)) {
                    mass2[i2] = 243.0;
                } else if (element[i2].equals(Cm)) {
                    mass2[i2] = 247.0;
                } else if (element[i2].equals(Bk)) {
                    mass2[i2] = 247.0;
                } else if (element[i2].equals(Cf)) {
                    mass2[i2] = 251.0;
                } else if (element[i2].equals(Es)) {
                    mass2[i2] = 252.0;
                } else if (element[i2].equals(Fm)) {
                    mass2[i2] = 257.0;
                } else if (element[i2].equals(Md)) {
                    mass2[i2] = 258.0;
                } else if (element[i2].equals(No)) {
                    mass2[i2] = 259.0;
                } else if (element[i2].equals(Lr)) {
                    mass2[i2] = 262.0;
                } else {
                    System.out.println("Wrong");
                    break;
                }
                System.out.println("What is the subscript of element: " + (i2 + 1) + "?");
                ss[i2] = Double.parseDouble(sc.nextLine());
            }
            double molarmass = 0.0;
            for (int i3 = 0; i3 < element.length; ++i3) {
                molarmass += mass2[i3] * ss[i3];
            }
            System.out.println("What is the coefficient of the unknown substance?");
            double coefficient2 = Double.parseDouble(sc.nextLine());
            System.out.println("How many elements make up the unknown substance?");
            int num2 = Integer.parseInt(sc.nextLine());
            String[] element2 = new String[num2];
            double[] mass3 = new double[num2];
            int[] ss2 = new int[num2];
            double molarmass2 = 0.0;
            for (i = 0; i < element2.length; ++i) {
                System.out.println("What is element: " + (i + 1) + "?");
                element2[i] = sc.nextLine();
                if (element2[i].equals(H)) {
                    mass3[i] = 1.0;
                } else if (element2[i].equals(He)) {
                    mass3[i] = 4.0;
                } else if (element2[i].equals(Li)) {
                    mass3[i] = 6.94;
                } else if (element2[i].equals(Be)) {
                    mass3[i] = 9.01;
                } else if (element2[i].equals(B)) {
                    mass3[i] = 10.81;
                } else if (element2[i].equals(C)) {
                    mass3[i] = 12.01;
                } else if (element2[i].equals(N)) {
                    mass3[i] = 14.01;
                } else if (element2[i].equals(O)) {
                    mass3[i] = 16.0;
                } else if (element2[i].equals(F)) {
                    mass3[i] = 19.0;
                } else if (element2[i].equals(Ne)) {
                    mass3[i] = 20.18;
                } else if (element2[i].equals(Na)) {
                    mass3[i] = 23.0;
                } else if (element2[i].equals(Mg)) {
                    mass3[i] = 24.3;
                } else if (element2[i].equals(Al)) {
                    mass3[i] = 27.0;
                } else if (element2[i].equals(Si)) {
                    mass3[i] = 28.09;
                } else if (element2[i].equals(P)) {
                    mass3[i] = 31.0;
                } else if (element2[i].equals(S)) {
                    mass3[i] = 32.07;
                } else if (element2[i].equals(Cl)) {
                    mass3[i] = 35.45;
                } else if (element2[i].equals(Ar)) {
                    mass3[i] = 39.94;
                } else if (element2[i].equals(K)) {
                    mass3[i] = 39.1;
                } else if (element2[i].equals(Ca)) {
                    mass3[i] = 40.08;
                } else if (element2[i].equals(Sc)) {
                    mass3[i] = 45.0;
                } else if (element2[i].equals(Ti)) {
                    mass3[i] = 47.87;
                } else if (element2[i].equals(V)) {
                    mass3[i] = 50.94;
                } else if (element2[i].equals(Cr)) {
                    mass3[i] = 52.0;
                } else if (element2[i].equals(Mn)) {
                    mass3[i] = 54.94;
                } else if (element2[i].equals(Fe)) {
                    mass3[i] = 55.85;
                } else if (element2[i].equals(Co)) {
                    mass3[i] = 58.93;
                } else if (element2[i].equals(Ni)) {
                    mass3[i] = 58.69;
                } else if (element2[i].equals(Cu)) {
                    mass3[i] = 63.55;
                } else if (element2[i].equals(Zn)) {
                    mass3[i] = 65.39;
                } else if (element2[i].equals(Ga)) {
                    mass3[i] = 69.72;
                } else if (element2[i].equals(Ge)) {
                    mass3[i] = 72.61;
                } else if (element2[i].equals(As)) {
                    mass3[i] = 74.92;
                } else if (element2[i].equals(Se)) {
                    mass3[i] = 78.96;
                } else if (element2[i].equals(Br)) {
                    mass3[i] = 79.9;
                } else if (element2[i].equals(Kr)) {
                    mass3[i] = 83.8;
                } else if (element2[i].equals(Rb)) {
                    mass3[i] = 85.47;
                } else if (element2[i].equals(Sr)) {
                    mass3[i] = 87.62;
                } else if (element2[i].equals(Y)) {
                    mass3[i] = 88.91;
                } else if (element2[i].equals(Zr)) {
                    mass3[i] = 91.22;
                } else if (element2[i].equals(Nb)) {
                    mass3[i] = 92.9;
                } else if (element2[i].equals(Mo)) {
                    mass3[i] = 95.94;
                } else if (element2[i].equals(Te)) {
                    mass3[i] = 98.0;
                } else if (element2[i].equals(Ru)) {
                    mass3[i] = 101.07;
                } else if (element2[i].equals(Rh)) {
                    mass3[i] = 102.9;
                } else if (element2[i].equals(Pd)) {
                    mass3[i] = 106.42;
                } else if (element2[i].equals(Ag)) {
                    mass3[i] = 107.87;
                } else if (element2[i].equals(Cd)) {
                    mass3[i] = 112.41;
                } else if (element2[i].equals(In)) {
                    mass3[i] = 114.82;
                } else if (element2[i].equals(Sn)) {
                    mass3[i] = 118.71;
                } else if (element2[i].equals(Sb)) {
                    mass3[i] = 121.76;
                } else if (element2[i].equals(Te)) {
                    mass3[i] = 127.6;
                } else if (element2[i].equals(I)) {
                    mass3[i] = 126.9;
                } else if (element2[i].equals(Xe)) {
                    mass3[i] = 131.29;
                } else if (element2[i].equals(Cs)) {
                    mass3[i] = 132.91;
                } else if (element2[i].equals(Ba)) {
                    mass3[i] = 137.33;
                } else if (element2[i].equals(La)) {
                    mass3[i] = 138.91;
                } else if (element2[i].equals(Hf)) {
                    mass3[i] = 178.49;
                } else if (element2[i].equals(Ta)) {
                    mass3[i] = 180.95;
                } else if (element2[i].equals(W)) {
                    mass3[i] = 183.84;
                } else if (element2[i].equals(Re)) {
                    mass3[i] = 186.21;
                } else if (element2[i].equals(Os)) {
                    mass3[i] = 190.23;
                } else if (element2[i].equals(Ir)) {
                    mass3[i] = 192.22;
                } else if (element2[i].equals(Pt)) {
                    mass3[i] = 195.08;
                } else if (element2[i].equals(Au)) {
                    mass3[i] = 196.97;
                } else if (element2[i].equals(Hg)) {
                    mass3[i] = 200.59;
                } else if (element2[i].equals(Tl)) {
                    mass3[i] = 204.38;
                } else if (element2[i].equals(Pb)) {
                    mass3[i] = 207.2;
                } else if (element2[i].equals(Bi)) {
                    mass3[i] = 208.98;
                } else if (element2[i].equals(Po)) {
                    mass3[i] = 209.0;
                } else if (element2[i].equals(At)) {
                    mass3[i] = 210.0;
                } else if (element2[i].equals(Rn)) {
                    mass3[i] = 222.0;
                } else if (element2[i].equals(Fr)) {
                    mass3[i] = 223.0;
                } else if (element2[i].equals(Ra)) {
                    mass3[i] = 226.0;
                } else if (element2[i].equals(Ac)) {
                    mass3[i] = 227.0;
                } else if (element2[i].equals(Rf)) {
                    mass3[i] = 261.0;
                } else if (element2[i].equals(Db)) {
                    mass3[i] = 262.0;
                } else if (element2[i].equals(Sg)) {
                    mass3[i] = 263.0;
                } else if (element2[i].equals(Bh)) {
                    mass3[i] = 262.0;
                } else if (element2[i].equals(Hs)) {
                    mass3[i] = 265.0;
                } else if (element2[i].equals(Mt)) {
                    mass3[i] = 266.0;
                } else if (element2[i].equals(Ce)) {
                    mass3[i] = 140.12;
                } else if (element2[i].equals(Pr)) {
                    mass3[i] = 140.91;
                } else if (element2[i].equals(Nd)) {
                    mass3[i] = 144.24;
                } else if (element2[i].equals(Pm)) {
                    mass3[i] = 145.0;
                } else if (element2[i].equals(Sm)) {
                    mass3[i] = 150.36;
                } else if (element2[i].equals(Eu)) {
                    mass3[i] = 151.96;
                } else if (element2[i].equals(Gd)) {
                    mass3[i] = 157.25;
                } else if (element2[i].equals(Tb)) {
                    mass3[i] = 158.93;
                } else if (element2[i].equals(Dy)) {
                    mass3[i] = 162.5;
                } else if (element2[i].equals(Ho)) {
                    mass3[i] = 164.93;
                } else if (element2[i].equals(Er)) {
                    mass3[i] = 167.26;
                } else if (element2[i].equals(Tm)) {
                    mass3[i] = 168.93;
                } else if (element2[i].equals(Yb)) {
                    mass3[i] = 173.04;
                } else if (element2[i].equals(Lu)) {
                    mass3[i] = 174.97;
                } else if (element2[i].equals(Th)) {
                    mass3[i] = 232.04;
                } else if (element2[i].equals(Pa)) {
                    mass3[i] = 231.04;
                } else if (element2[i].equals(U)) {
                    mass3[i] = 238.03;
                } else if (element2[i].equals(Np)) {
                    mass3[i] = 237.0;
                } else if (element2[i].equals(Pu)) {
                    mass3[i] = 244.0;
                } else if (element2[i].equals(Am)) {
                    mass3[i] = 243.0;
                } else if (element2[i].equals(Cm)) {
                    mass3[i] = 247.0;
                } else if (element2[i].equals(Bk)) {
                    mass3[i] = 247.0;
                } else if (element2[i].equals(Cf)) {
                    mass3[i] = 251.0;
                } else if (element2[i].equals(Es)) {
                    mass3[i] = 252.0;
                } else if (element2[i].equals(Fm)) {
                    mass3[i] = 257.0;
                } else if (element2[i].equals(Md)) {
                    mass3[i] = 258.0;
                } else if (element2[i].equals(No)) {
                    mass3[i] = 259.0;
                } else if (element2[i].equals(Lr)) {
                    mass3[i] = 262.0;
                } else {
                    System.out.println("Wrong");
                    break;
                }
                System.out.println("What is the subscript of element: " + (i + 1) + "?");
                ss2[i] = Integer.parseInt(sc.nextLine());
            }
            for (i = 0; i < element2.length; ++i) {
                molarmass2 += mass3[i] * (double)ss2[i];
            }
            double ans2 = knownmass / molarmass * (coefficient2 / coefficient) * molarmass2;
            System.out.print("" + ans2 + "g");
        } else if (ans == 3) {
            int i;
            System.out.println("How many elements make up the substance?");
            int num5 = Integer.parseInt(sc.nextLine());
            String[] element2 = new String[num5];
            double[] mass3 = new double[num5];
            int[] ss = new int[num5];
            double molarmass = 0.0;
            for (i = 0; i < element2.length; ++i) {
                System.out.println("What is element: " + (i + 1));
                element2[i] = sc.nextLine();
                if (element2[i].equals(H)) {
                    mass3[i] = 1.0;
                } else if (element2[i].equals(He)) {
                    mass3[i] = 4.0;
                } else if (element2[i].equals(Li)) {
                    mass3[i] = 6.94;
                } else if (element2[i].equals(Be)) {
                    mass3[i] = 9.01;
                } else if (element2[i].equals(B)) {
                    mass3[i] = 10.81;
                } else if (element2[i].equals(C)) {
                    mass3[i] = 12.01;
                } else if (element2[i].equals(N)) {
                    mass3[i] = 14.01;
                } else if (element2[i].equals(O)) {
                    mass3[i] = 16.0;
                } else if (element2[i].equals(F)) {
                    mass3[i] = 19.0;
                } else if (element2[i].equals(Ne)) {
                    mass3[i] = 20.18;
                } else if (element2[i].equals(Na)) {
                    mass3[i] = 23.0;
                } else if (element2[i].equals(Mg)) {
                    mass3[i] = 24.3;
                } else if (element2[i].equals(Al)) {
                    mass3[i] = 27.0;
                } else if (element2[i].equals(Si)) {
                    mass3[i] = 28.09;
                } else if (element2[i].equals(P)) {
                    mass3[i] = 31.0;
                } else if (element2[i].equals(S)) {
                    mass3[i] = 32.07;
                } else if (element2[i].equals(Cl)) {
                    mass3[i] = 35.45;
                } else if (element2[i].equals(Ar)) {
                    mass3[i] = 39.94;
                } else if (element2[i].equals(K)) {
                    mass3[i] = 39.1;
                } else if (element2[i].equals(Ca)) {
                    mass3[i] = 40.08;
                } else if (element2[i].equals(Sc)) {
                    mass3[i] = 45.0;
                } else if (element2[i].equals(Ti)) {
                    mass3[i] = 47.87;
                } else if (element2[i].equals(V)) {
                    mass3[i] = 50.94;
                } else if (element2[i].equals(Cr)) {
                    mass3[i] = 52.0;
                } else if (element2[i].equals(Mn)) {
                    mass3[i] = 54.94;
                } else if (element2[i].equals(Fe)) {
                    mass3[i] = 55.85;
                } else if (element2[i].equals(Co)) {
                    mass3[i] = 58.93;
                } else if (element2[i].equals(Ni)) {
                    mass3[i] = 58.69;
                } else if (element2[i].equals(Cu)) {
                    mass3[i] = 63.55;
                } else if (element2[i].equals(Zn)) {
                    mass3[i] = 65.39;
                } else if (element2[i].equals(Ga)) {
                    mass3[i] = 69.72;
                } else if (element2[i].equals(Ge)) {
                    mass3[i] = 72.61;
                } else if (element2[i].equals(As)) {
                    mass3[i] = 74.92;
                } else if (element2[i].equals(Se)) {
                    mass3[i] = 78.96;
                } else if (element2[i].equals(Br)) {
                    mass3[i] = 79.9;
                } else if (element2[i].equals(Kr)) {
                    mass3[i] = 83.8;
                } else if (element2[i].equals(Rb)) {
                    mass3[i] = 85.47;
                } else if (element2[i].equals(Sr)) {
                    mass3[i] = 87.62;
                } else if (element2[i].equals(Y)) {
                    mass3[i] = 88.91;
                } else if (element2[i].equals(Zr)) {
                    mass3[i] = 91.22;
                } else if (element2[i].equals(Nb)) {
                    mass3[i] = 92.9;
                } else if (element2[i].equals(Mo)) {
                    mass3[i] = 95.94;
                } else if (element2[i].equals(Te)) {
                    mass3[i] = 98.0;
                } else if (element2[i].equals(Ru)) {
                    mass3[i] = 101.07;
                } else if (element2[i].equals(Rh)) {
                    mass3[i] = 102.9;
                } else if (element2[i].equals(Pd)) {
                    mass3[i] = 106.42;
                } else if (element2[i].equals(Ag)) {
                    mass3[i] = 107.87;
                } else if (element2[i].equals(Cd)) {
                    mass3[i] = 112.41;
                } else if (element2[i].equals(In)) {
                    mass3[i] = 114.82;
                } else if (element2[i].equals(Sn)) {
                    mass3[i] = 118.71;
                } else if (element2[i].equals(Sb)) {
                    mass3[i] = 121.76;
                } else if (element2[i].equals(Te)) {
                    mass3[i] = 127.6;
                } else if (element2[i].equals(I)) {
                    mass3[i] = 126.9;
                } else if (element2[i].equals(Xe)) {
                    mass3[i] = 131.29;
                } else if (element2[i].equals(Cs)) {
                    mass3[i] = 132.91;
                } else if (element2[i].equals(Ba)) {
                    mass3[i] = 137.33;
                } else if (element2[i].equals(La)) {
                    mass3[i] = 138.91;
                } else if (element2[i].equals(Hf)) {
                    mass3[i] = 178.49;
                } else if (element2[i].equals(Ta)) {
                    mass3[i] = 180.95;
                } else if (element2[i].equals(W)) {
                    mass3[i] = 183.84;
                } else if (element2[i].equals(Re)) {
                    mass3[i] = 186.21;
                } else if (element2[i].equals(Os)) {
                    mass3[i] = 190.23;
                } else if (element2[i].equals(Ir)) {
                    mass3[i] = 192.22;
                } else if (element2[i].equals(Pt)) {
                    mass3[i] = 195.08;
                } else if (element2[i].equals(Au)) {
                    mass3[i] = 196.97;
                } else if (element2[i].equals(Hg)) {
                    mass3[i] = 200.59;
                } else if (element2[i].equals(Tl)) {
                    mass3[i] = 204.38;
                } else if (element2[i].equals(Pb)) {
                    mass3[i] = 207.2;
                } else if (element2[i].equals(Bi)) {
                    mass3[i] = 208.98;
                } else if (element2[i].equals(Po)) {
                    mass3[i] = 209.0;
                } else if (element2[i].equals(At)) {
                    mass3[i] = 210.0;
                } else if (element2[i].equals(Rn)) {
                    mass3[i] = 222.0;
                } else if (element2[i].equals(Fr)) {
                    mass3[i] = 223.0;
                } else if (element2[i].equals(Ra)) {
                    mass3[i] = 226.0;
                } else if (element2[i].equals(Ac)) {
                    mass3[i] = 227.0;
                } else if (element2[i].equals(Rf)) {
                    mass3[i] = 261.0;
                } else if (element2[i].equals(Db)) {
                    mass3[i] = 262.0;
                } else if (element2[i].equals(Sg)) {
                    mass3[i] = 263.0;
                } else if (element2[i].equals(Bh)) {
                    mass3[i] = 262.0;
                } else if (element2[i].equals(Hs)) {
                    mass3[i] = 265.0;
                } else if (element2[i].equals(Mt)) {
                    mass3[i] = 266.0;
                } else if (element2[i].equals(Ce)) {
                    mass3[i] = 140.12;
                } else if (element2[i].equals(Pr)) {
                    mass3[i] = 140.91;
                } else if (element2[i].equals(Nd)) {
                    mass3[i] = 144.24;
                } else if (element2[i].equals(Pm)) {
                    mass3[i] = 145.0;
                } else if (element2[i].equals(Sm)) {
                    mass3[i] = 150.36;
                } else if (element2[i].equals(Eu)) {
                    mass3[i] = 151.96;
                } else if (element2[i].equals(Gd)) {
                    mass3[i] = 157.25;
                } else if (element2[i].equals(Tb)) {
                    mass3[i] = 158.93;
                } else if (element2[i].equals(Dy)) {
                    mass3[i] = 162.5;
                } else if (element2[i].equals(Ho)) {
                    mass3[i] = 164.93;
                } else if (element2[i].equals(Er)) {
                    mass3[i] = 167.26;
                } else if (element2[i].equals(Tm)) {
                    mass3[i] = 168.93;
                } else if (element2[i].equals(Yb)) {
                    mass3[i] = 173.04;
                } else if (element2[i].equals(Lu)) {
                    mass3[i] = 174.97;
                } else if (element2[i].equals(Th)) {
                    mass3[i] = 232.04;
                } else if (element2[i].equals(Pa)) {
                    mass3[i] = 231.04;
                } else if (element2[i].equals(U)) {
                    mass3[i] = 238.03;
                } else if (element2[i].equals(Np)) {
                    mass3[i] = 237.0;
                } else if (element2[i].equals(Pu)) {
                    mass3[i] = 244.0;
                } else if (element2[i].equals(Am)) {
                    mass3[i] = 243.0;
                } else if (element2[i].equals(Cm)) {
                    mass3[i] = 247.0;
                } else if (element2[i].equals(Bk)) {
                    mass3[i] = 247.0;
                } else if (element2[i].equals(Cf)) {
                    mass3[i] = 251.0;
                } else if (element2[i].equals(Es)) {
                    mass3[i] = 252.0;
                } else if (element2[i].equals(Fm)) {
                    mass3[i] = 257.0;
                } else if (element2[i].equals(Md)) {
                    mass3[i] = 258.0;
                } else if (element2[i].equals(No)) {
                    mass3[i] = 259.0;
                } else if (element2[i].equals(Lr)) {
                    mass3[i] = 262.0;
                } else {
                    System.out.println("Wrong");
                    break;
                }
                System.out.println("What is the subscript of element: " + (i + 1));
                ss[i] = Integer.parseInt(sc.nextLine());
            }
            for (i = 0; i < element2.length; ++i) {
                molarmass += mass3[i] * (double)ss[i];
            }
            System.out.println("" + molarmass + "g");
        }
    }
}
