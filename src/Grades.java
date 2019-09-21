public class Grades {
    int m_myYear1,m_nYear2,m_nYear3,m_totalYears=3,m_Totalsum;

    public Grades(int year1,int year2,int year3){
        m_myYear1=year1;
        m_nYear2=year2;
        m_nYear3=year3;
    }
    public int getAvg(){
      int m_totalSum=m_myYear1+m_nYear2+m_nYear3;

        return m_totalSum/m_totalYears;
    }
}
