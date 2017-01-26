package com.primera.android.tresenraya;

/**
 * Created by Marcelo Torrez on 10/11/2015.
 */
public class matris {

        private int m[][];

        public matris(){
            m = new int[3][3];
            for(int i =0 ; i<3;i++){
                for(int j=0;j<3;j++){
                    m[i][j]= 0;
                }
            }
        }


        public void setElementoO(int x, int y){
            m[x][y]=1;
        }

        public void setElementoX(int x,int y){
            m[x][y]=2;
        }

        public void LlenarMatris(){
            for(int i =0 ; i<3;i++){
                for(int j=0;j<3;j++){
                    m[i][j]= 0;
                }
            }
        }

        public int getElemento(int x, int y){
            return m[x][y];
        }

        public boolean horizontalO(){
            int c=0;
            for (int i=0;i<3;i++){
                for(int j=0;j<3;j++){
                    if(m[i][j]==1){
                        c=c+1;
                    }
                }
                if(c==3){
                    return true;
                }
                else{
                    c=0;
                }
            }
            return false;
        }

        public boolean horizontalX(){
            int c=0;
            for (int i=0;i<3;i++){
                for(int j=0;j<3;j++){
                    if(m[i][j]==2){
                        c=c+1;
                    }
                }
                if(c==3){
                    return true;
                }
                else{
                    c=0;
                }
            }
            return false;
        }

        public boolean verticalO(){
            int c=0;
            for (int i=0;i<3;i++){
                for(int j=0;j<3;j++){
                    if(m[j][i]==1){
                        c=c+1;
                    }
                }
                if(c==3){
                    return true;
                }
                else{
                    c=0;
                }
            }
            return false;
        }

        public boolean verticalX(){
            int c=0;
            for (int i=0;i<3;i++){
                for(int j=0;j<3;j++){
                    if(m[j][i]==2){
                        c=c+1;
                    }
                }
                if(c==3){
                    return true;
                }
                else{
                    c=0;
                }
            }
            return false;
        }

        public boolean diagonalO(){
            return m[0][0]== 1 && m[1][1]== 1 && m[2][2]== 1 || m[0][2]== 1 && m[1][1]== 1 && m[2][0]== 1;
        }

        public boolean diagonalX(){
            return m[0][0]== 2 && m[1][1]== 2 && m[2][2]== 2 || m[0][2]== 2 && m[1][1]== 2 && m[2][0]== 2;
        }

    public boolean horizontal1(){
        return m[0][0]== 2 && m[0][1]==2;
    }

    public boolean horizontal2(){
        return m[0][0]== 2 && m[0][2]==2;
    }

    public boolean horizontal3(){
        return m[0][1]== 2 && m[0][2]==2;
    }

    public boolean horizontal4(){
        return m[1][0]== 2 && m[1][1]==2;
    }

    public boolean horizontal5(){
        return m[1][0]== 2 && m[1][2]==2;
    }

    public boolean horizontal6(){
        return m[1][1]== 2 && m[1][2]==2;
    }

    public boolean horizontal7(){
        return m[2][0]== 2 && m[2][1]==2;
    }

    public boolean horizontal8(){
        return m[2][0]== 2 && m[2][2]==2;
    }

    public boolean horizontal9(){
        return m[2][1]== 2 && m[2][2]==2;
    }

    }
