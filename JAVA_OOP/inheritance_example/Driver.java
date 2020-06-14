public class Driver {

  public static void main(String[] args) {

    String[] input = {
      "Student,Betty Reichenbach,4714417,senior",
      "Student,Dora Tillotson,1688430,sophomore",
      "Faculty,Tianna Guinan,1750608,2000,true,Assistant Professor",
      "Staff,Deann Borrego,1792298,1500,Mr.",
      "Student,Diamond Mccright,1290609,sophomore",
      "Student,Rossie Gregerson,4926381,junior",
      "Faculty,Lavonna Gorelick,3619164,2500,true,Professor",
      "Staff,Griselda Longway,1818130,1520,Miss",
      "Faculty,Donnette Yost,9934984,2000,false,Instructor",
      "Student,Beula Brar,1255609,junior"
  };



      for(int i=0; i<input.length; i++) {
        String[] str = input[i].split(",");
        if(str[0] == "Student") {
          Student s = new Student(str[1], str[2], str[3]);
          System.out.println(s.toString() +  s.getName());
        }
      }


  

  }

}