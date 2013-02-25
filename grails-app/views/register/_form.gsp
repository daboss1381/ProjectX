
<z:rows>

  <z:row>
    <z:label value="Name:" width="300px"/>
    <z:textbox name="name" value="${registerInstance?.name}" width="500px"/>
  </z:row>

  <z:row>
    <z:label value="Surname:" width="300px"/>
    <z:textbox name="surname" value="${registerInstance?.surname}" width="500px"/>
  </z:row>

  <z:row>
    <z:label value="Email Address:" width="300px"/>
    <z:textbox name="email" value="${registerInstance?.email}" width="500px"/>
  </z:row>

  <z:row>
    <z:label value="Date Of Birth:" width="300px"/>
    <z:datebox name="dob" value="${registerInstance?.dob}" width="505px"/>
  </z:row>

  <z:row>
    <z:label value="Age:" width="300px"/>
    <z:textbox name="age" value="${fieldValue(bean: registerInstance, field: 'age')}" width="500px"/>
  </z:row>

  <z:row>
    <z:label value="Grade:" width="300px"/>
    <z:textbox name="grade" value="${registerInstance?.grade}" width="500px"/>
  </z:row>

  <z:row>
    <z:label value="Gender:" width="300px"/>
    <zkui:select name="gender" from="${registerInstance.constraints.gender.inList}" value="${registerInstance?.gender}" valueMessagePrefix="register.gender"  width="505px"/>
  </z:row>

  <z:row>
    <z:label value="Cellphone Number:" width="300px"/>
    <z:textbox name="cell" value="${registerInstance?.cell}" width="500px"/>
  </z:row>

  <z:row>
    <z:label value="Address:" width="300px"/>
    <z:textbox name="address" value="${registerInstance?.address}" width="500px"/>
  </z:row>

  <z:row>
    <z:label value="Mother's Name:" width="300px"/>
    <z:textbox name="motherName" value="${registerInstance?.motherName}" width="500px"/>
  </z:row>

  <z:row>
    <z:label value="Mother's Cellphone Number:" width="300px"/>
    <z:textbox name="motherCell" value="${registerInstance?.motherCell}" width="500px"/>
  </z:row>

  <z:row>
    <z:label value="Father's Name:" width="300px"/>
    <z:textbox name="fatherName" value="${registerInstance?.fatherName}" width="500px"/>
  </z:row>

  <z:row>
    <z:label value="Father's Cellphone Number:" width="300px"/>
    <z:textbox name="fatherCell" value="${registerInstance?.fatherCell}" width="500px"/>
  </z:row>

  <z:row>
    <z:label value="Regestration Date:" width="300px"/>
    <z:textbox name="regDate" value="${registerInstance?.regDate}" width="500px" readonly="true"/>
  </z:row>

</z:rows>