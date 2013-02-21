
<z:rows>

    <z:row>
        <z:label value="${message(code:'register.name.label',default:'Name')}" width="300px"/>
        <z:textbox name="name" value="${registerInstance?.name}" width="300px"/>
    </z:row>

    <z:row>
        <z:label value="${message(code:'register.surname.label',default:'Surname')}" width="300px"/>
        <z:textbox name="surname" value="${registerInstance?.surname}" width="300px"/>
    </z:row>

    <z:row>
        <z:label value="Date of Birth" width="300px"/>
        <z:datebox name="dob" value="${registerInstance?.dob}" width="305px"/>
    </z:row>

    <z:row>
        <z:label value="${message(code:'register.age.label',default:'Age')}" width="300px"/>
        <z:textbox name="age" value="${fieldValue(bean: registerInstance, field: 'age')}"  width="300px"/>
    </z:row>

    <z:row>
        <z:label value="${message(code:'register.grade.label',default:'Grade')}" width="300px"/>
        <z:textbox name="grade" value="${registerInstance?.grade}" width="300px"/>
    </z:row>

    <z:row>
        <z:label value="${message(code:'register.gender.label',default:'Gender')}" width="300px"/>
        <zkui:select name="gender" from="${registerInstance.constraints.gender.inList}" value="${registerInstance?.gender}" valueMessagePrefix="register.gender"  width="305px"/>
    </z:row>

    <z:row>
        <z:label value="Date of Registration" width="300px"/>
        <z:textbox name="regDate" value="${registerInstance?.regDate}" readonly="true" width="305px"/>
    </z:row>

    <z:row>
        <z:label value="${message(code:'register.cell.label',default:'Cell')}" width="300px"/>
        <z:textbox name="cell" value="${registerInstance?.cell}" width="300px"/>
    </z:row>

    <z:row>
        <z:label value="${message(code:'register.address.label',default:'Address')}" width="300px"/>
        <z:textbox name="address" value="${registerInstance?.address}" width="300px"/>
    </z:row>

    <z:row>
        <z:label value="${message(code:'register.motherName.label',default:'Mother Name')}" width="300px"/>
        <z:textbox name="motherName" value="${registerInstance?.motherName}" width="300px"/>
    </z:row>

    <z:row>
        <z:label value="${message(code:'register.motherCell.label',default:'Mother Cell')}" width="300px"/>
        <z:textbox name="motherCell" value="${registerInstance?.motherCell}" width="300px"/>
    </z:row>

    <z:row>
        <z:label value="${message(code:'register.fatherName.label',default:'Father Name')}" width="300px"/>
        <z:textbox name="fatherName" value="${registerInstance?.fatherName}" width="300px"/>
    </z:row>

    <z:row>
        <z:label value="${message(code:'register.fatherCell.label',default:'Father Cell')}" width="300px"/>
        <z:textbox name="fatherCell" value="${registerInstance?.fatherCell}" width="300px"/>
    </z:row>

</z:rows>