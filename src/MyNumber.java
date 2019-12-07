/**
 * ... comment class...
 *
 * @author teresa.salwocka@o2.pl
 * @since 07.12.2019
 **/
final class MyNumber {

    int number = 0;

    public MyNumber(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public boolean isOdd(){ //atrybut nieparzysty
        if (this.number %2 == 1){
            return true;
        }
        else return false;
    }

    public boolean isEven(){   //atrybut jest parzysty,
        return this.number %2 == 0;
    }

    public MyNumber add(MyNumber x){ //zwraca sumę atrybutu i x opakowaną w klasę MyNumber,
        if (x.number >= 0) {
            return new MyNumber(this.number + x.number);
        }else{
            return this;
        }
    }

    // zwraca różnicę atrybutu
    public MyNumber subtract (MyNumber x) {
        return new MyNumber(this.number - x.number);
    }
}
