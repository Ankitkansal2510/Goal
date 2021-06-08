package Comparable;

public class MyComparable implements Comparable<MyComparable>{

    int id;
    String name;

    public MyComparable(int id, String name){
        this.id=id;
        this.name=name;
    }

    public String getName(){
        return this.name;
    }

    public int getId(){
        return  this.id;
    }

    public int compareTo(MyComparable  e){
        int result=this.name.compareTo(e.name);
        if(result>0){
            return 1;
        }
        else if(result<0){
            return -1;
        }
        else{
            return  0;
        }
    }

    @Override
    public String toString() {
        return
                 id +
                "," + name ;
    }
}
