public
    class S23605_zestaw02 {

    public void cwiczenie_1(){
        System.out.println(0b10100101);
        System.out.println(0245);
        System.out.println(0xa5);
    }

    public void cwiczenie_2(){
        long x = 0b1110;
        x = x >> 0;
        System.out.println(x);
        x = x << 2;
        System.out.println(x);
        x = x >> 4;
        System.out.println(x);
    }

    public void cwiczenie_3(){
        long x = 0b001011010101010101101101011011101;
        System.out.println(x);
        long mask_1 = 0b00000000000000000000000000011111;
        System.out.println(x & mask_1);

        long mask_2 = 0b00000000000000000000000001000000;
        System.out.println((x & mask_2) >> 6);

        long mask_3 = 0b11111111000000000000000000000000;
        long mask_4 = 0b00000000111111110000000000000000;
        long mask_5 = 0b00000000000000001111111100000000;
        long mask_6 = 0b00000000000000000000000011111111;
        System.out.println(x & mask_3);
        System.out.println(x & mask_4);
        System.out.println(x & mask_5);
        System.out.println(x & mask_6);

        long mask_7 = mask_4 | mask_5;
        System.out.println((x & mask_7) >> 8);
    }

    public void cwiczenie_4(){
        int a1 = 0x6D, a2 = 0b0001101, a = a1 & a2,
            b1 = 0xA, b2 = 0b0101, b = b1 | b2,
            c1 = 11 << 2, c2 = 0b000110, c = c1 ^ c2;
        System . out . println (a+" "+b+" "+c);
    }

}