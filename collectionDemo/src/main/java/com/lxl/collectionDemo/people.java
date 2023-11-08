package com.lxl.collectionDemo;

import java.util.Objects;

public class people implements Comparable<people>{
    private int age;
    private String name;
    private double high;

    public people() {
    }

    public people(int age, String name, double high) {
        this.age = age;
        this.name = name;
        this.high = high;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getHigh() {
        return high;
    }

    public void setHigh(double high) {
        this.high = high;
    }
    //
    @Override
    public boolean equals(Object o) {
        //第一步判断引用对象是否一致
        if (this == o) return true;
        //第二步判空
        if (o == null || getClass() != o.getClass()) return false;

        people people = (people) o;
        //三个与判断最后时候相等
        return age == people.age &&
                Double.compare(people.high, high) == 0 &&
                Objects.equals(name, people.name);
    }
    //重写hascode，根据里面的数据判断，不是根据对象引用
    @Override
    public int hashCode() {
        return Objects.hash(age, name, high);
    }

    @Override
    public String toString() {
        return "people{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", high=" + high +
                '}';
    }

    /**
     * Compares this object with the specified object for order.  Returns a
     * negative integer, zero, or a positive integer as this object is less
     * than, equal to, or greater than the specified object.
     *
     * <p>The implementor must ensure <tt>sgn(x.compareTo(y)) ==
     * -sgn(y.compareTo(x))</tt> for all <tt>x</tt> and <tt>y</tt>.  (This
     * implies that <tt>x.compareTo(y)</tt> must throw an exception iff
     * <tt>y.compareTo(x)</tt> throws an exception.)
     *
     * <p>The implementor must also ensure that the relation is transitive:
     * <tt>(x.compareTo(y)&gt;0 &amp;&amp; y.compareTo(z)&gt;0)</tt> implies
     * <tt>x.compareTo(z)&gt;0</tt>.
     *
     * <p>Finally, the implementor must ensure that <tt>x.compareTo(y)==0</tt>
     * implies that <tt>sgn(x.compareTo(z)) == sgn(y.compareTo(z))</tt>, for
     * all <tt>z</tt>.
     *
     * <p>It is strongly recommended, but <i>not</i> strictly required that
     * <tt>(x.compareTo(y)==0) == (x.equals(y))</tt>.  Generally speaking, any
     * class that implements the <tt>Comparable</tt> interface and violates
     * this condition should clearly indicate this fact.  The recommended
     * language is "Note: this class has a natural ordering that is
     * inconsistent with equals."
     *
     * <p>In the foregoing description, the notation
     * <tt>sgn(</tt><i>expression</i><tt>)</tt> designates the mathematical
     * <i>signum</i> function, which is defined to return one of <tt>-1</tt>,
     * <tt>0</tt>, or <tt>1</tt> according to whether the value of
     * <i>expression</i> is negative, zero or positive.
     *
     * @param o the object to be compared.
     * @return a negative integer, zero, or a positive integer as this object
     * is less than, equal to, or greater than the specified object.
     * @throws NullPointerException if the specified object is null
     * @throws ClassCastException   if the specified object's type prevents it
     *                              from being compared to this object.
     */
    @Override
    public int compareTo(people o) {
//        //年龄是否一致
//        int n1=this.getAge()-o.getAge();
//        //名字是否一致
//        int n2=this.name.compareTo(o.getName());
//        //身高是否一致
//        double n3=(this.high-o.getHigh());
//        //当n1与n2均为0是，才返回0，比较为重复元素
//        if(n1==0&&n2==0&&n3==0)
//            return 0;
//        else
//            return 1;
        //年龄是否一致
        int result = this.getAge()-o.getAge();
        //年龄一致比较名字
        result = result==0?this.name.compareTo(o.getName()):result;
        //年龄名字一致比较身高
        result =result==0?(int)(this.high-o.getHigh()):result;
        //当结果返回0，表示数据是重复的
        return  result;
    }
}
