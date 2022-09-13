
public class lec1{

    static void m1(int a){
        System.out.println(a);
    }
    static void m2(String b){
        System.out.println(b);
    }
public static void main(String[] args ) {
    
    String linBre = "***********************************";
    String head = "            <.>AGS \n    HPCL ABHINAV SERVICE CE \n    DHARANJAIGARH ROAD VILLA \n GE PUNJIPATHRA DISTRICT RAIGARH \n            RAIGARH \n             SALE \n";
    String body = " TC: 313EB387A2236DC1 \n APPL NAME: VISA CREDIT \n AID:  A0000000031010 \n TVR: 0000048000     TSI: E800 \n DATE/TIME: 04/04/2022  18:44:51 \n TID: HP086136       MID: 11000000000073086 \n BATCH NUM: 001439   RRN: 00424667315 \n TXN TD: 941247      INVOICE NUM: 002644\n CARD TYPE: VISA     AUTH CODE: 6/1330 \n CARD NO: 403562*******7003    CHIP:";

    String totCost ="TOTAL AMOUNT:  RS.  2000.00"; 

    String foot = "PIN VERIFIED OK SIGNATURE NOT REQUIRED \n        MAHANDRA SHRIVAS \n     IAM SATISFIED WITH GOODS\n SERVICES RECEIVED AND AGREE TO\n PAY AS PER CARD ISSUER AGREEMENT \n     *****MERCHANT COPY*****\n    VERSION HPCLPAX 1 0 0 43 \n Powered By     India Transact Services \n Sponsor Bank     Indusind \n";
    m2(linBre);
    m2(head);
    m2(body);
    m2(linBre);
    m2(totCost);
    m2(linBre);
    m2(foot);
    m2(linBre);
    
}}