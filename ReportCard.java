package com.example.android.reportcard;


public class ReportCard {
    private char ancientGreeks , chemistry;
    private String biology;
    private int informatics ;
    private double maths ;

    public ReportCard (char ancientGreeks , char chemistry , String biology , int informatics , double maths){
        this.ancientGreeks = ancientGreeks;
        this.chemistry = chemistry;
        this.biology = biology;
        this.informatics = informatics ;
        this.maths = maths;
    }
    public char getAncientGreeks() {
        return ancientGreeks;
    }
    public void setAncientGreeks(char ancientGreeks) {
        this.ancientGreeks = ancientGreeks;
    }
    public char getChemistry() {
        return chemistry;
    }
    public void setChemistry(char chemistry) {
        this.chemistry = chemistry;
    }
    public String getBiology() {
        return biology;
    }
    public void setBiology(String biology) {
        this.biology = biology;
    }
    public int getInformatics() {
        return informatics;
    }
    public void setInformatics(int informatics) {
        this.informatics = informatics;
    }
    public double getMaths() {
        return maths;
    }
    public void setMaths(double maths) {
        this.maths = maths;

    }
    @Override
    public String toString() {
        return "Grades{" +
                "ancientGreeks=" + ancientGreeks +
                ", chemistry=" + chemistry +
                ", biology='" + biology + '\'' +
                ", informatics=" + informatics +
                ", maths=" + maths +
                '}';
    }
}
