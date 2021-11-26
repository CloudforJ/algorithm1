package week1;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.UF;

public class QuickFindUF {
    private int[] id;

    public QuickFindUF(int N) {
        id = new int[N];
        for (int i = 0; i < N; i++) {
            id[i] = i;
        }
    }

    public boolean connected(int p, int q) {
        if (id[p] == id[q]) {
            return true;
        }
        return false;
    }

    public void union(int p, int q) {
        int pid = id[p];
        int qid = id[q];
        for (int i = 0; i < id.length; i++) {
            if (id[i] == pid) {
                id[i] = qid;
            }
        }
    }

    public static void main(String[] args) {
        int N = 10;
        QuickFindUF quickFindUF = new QuickFindUF(10);
        for (int i = 0; i < N; i++) {
            System.out.println(quickFindUF.id[i]);
        }
        quickFindUF.union(4, 3);
        quickFindUF.union(3, 8);
        quickFindUF.union(6, 5);
        quickFindUF.union(9, 4);
        quickFindUF.union(2,1);
        System.out.println(quickFindUF.connected(0, 7));
        System.out.println(quickFindUF.connected(8,9));
        quickFindUF.union(5, 0);
        quickFindUF.union(7, 2);
        quickFindUF.union(6, 1);
        quickFindUF.union(1, 0);
        System.out.println(quickFindUF.connected(0, 7));
//        UF uf = new UF(N);
//        while (!StdIn.isEmpty()) {
//            int p = StdIn.readInt();
//            int q = StdIn.readInt();
//            if (!uf.connected(p, q)) {
//                uf.union(p, q);
//                StdOut.println(p + " " + q);
//            }
//        }
//        System.out.println(N);
    }
}
