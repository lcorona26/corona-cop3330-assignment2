package ex37;

import java.util.List;
import java.util.Arrays;

public class Store {
    public void Password(int length, int special, int numbers) {

        String alpha = "A,B,C,D,E,F,G,H,I,J,K,L,M,N,O,P,Q,R,S,T,U,V,W,X,Y,Z," +
                "a,b,c,d,e,f,g,h,i,j,k,l,m,n,o,p,q,r,s,t,u,v,w,x,y,z";
        String num = "0,1,2,3,4,5,6,7,8,9";
        String symbols = "!,@,#,$,%,^,&,*,_,=,+,-,/,.,?,<,>,)";

        List<String> alphaList = Arrays.asList(alpha.split(",", -1));
        List<String> numList = Arrays.asList(num.split(",", -1));
        List<String> symbolList = Arrays.asList(symbols.split(",", -1));

        int atLeast = special + numbers;

        for(int i = 0; i<atLeast; i++) {
            int c = (int) (Math.random() * alphaList.size());
            System.out.print(alphaList.get(c));
        }
        for(int i = 0; i< special; i++){
            int s =(int) (Math.random() * symbolList.size());
            System.out.print(symbolList.get(s));
        }
        for(int i = 0; i< numbers; i++){
            int n =(int) (Math.random() * numList.size());
            System.out.print(numList.get(n));
        }
    }
}