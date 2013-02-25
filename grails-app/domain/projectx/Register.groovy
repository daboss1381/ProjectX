package projectx

/*
 *REQUIRED FIEDLS:
 *name
 *surname
 *BirthDate
 *age
 *grade
 *gender
 *regDate
 *cell
 *address
 *motherName
 *motherCell
 *fatherName
 *fatherCell
 *image
 **/

class Register {
    
    //use mongoDB to store data from this class
    static mapWith = "mongo"
    
    //declaring all fields
    String name
    String surname
    Date dob
    BigInteger age
    String grade
    String gender
    String regDate = getCurrentDate()
    String cell
    String address
    String motherName
    String motherCell
    String fatherName
    String fatherCell
    String email
    
    static constraints = {
        name(blank:false)
        surname(blank:false)
        email(email:true)
        dob()
        age()
        grade()
        gender(blank:false, inList:["Male", "Female"])        
        cell()
        address()        
        motherName()
        motherCell()
        fatherName()
        fatherCell()
        regDate()
    }
    
    String toString(){
        return "${name}, ${regDate.format('MM/dd/yyyy')}"
    }
    
    def getCurrentDate(){
        return new Date()
    }
}