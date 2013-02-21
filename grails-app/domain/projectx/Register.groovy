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
    
    //declaring all fields
    String name
    String surname
    Date dob
    BigInteger age
    String grade
    String gender
    Date regDate = getCurrentDate()
    String cell
    String address
    String motherName
    String motherCell
    String fatherName
    String fatherCell    
    
    static constraints = {
        name(blank:false)
        surname(blank:false)
        dob(blank:false)
        age()
        grade()
        gender(inList:["Male", "Female"])
        regDate()
        cell(blank:false)
        address(blank:false)
        motherName()
        motherCell()
        fatherName()
        fatherCell()
    }
    
    String toString(){
        return "${name}, ${regDate.format('MM/dd/yyyy')}"
    }
    
        def getCurrentDate(){
            return new Date()
        }
}
