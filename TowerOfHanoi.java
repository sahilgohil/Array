public static void towerOfHanoi(int plates, String towerA, String towerB, String towerC) {

        if(plates == 0) return;

        // first move the plates from tower A to tower C using tower B
        towerOfHanoi(plates-1, towerA, towerC, towerB);

        System.out.println(plates+" "+towerA+" -> "+towerB);

        towerOfHanoi(plates-1, towerC, towerB, towerA);
        
    }
