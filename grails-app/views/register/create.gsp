<html>
<head>
    <meta name="layout" content="main" />
    <g:set var="entityName" value="${message(code: 'register.label', default: 'Register')}" />
    <title><g:message code="default.create.label" args="[entityName]" /></title>
</head>

<body>
<z:window style="padding:5px" apply="projectx.register.CreateComposer">
    <z:grid>
        <tmpl:form/>
    </z:grid>
    <z:hlayout>
        <z:button id="saveButton" label="${message(code: 'default.button.create.label', default: 'Create')}"/>
        <z:button href="${createLink(action:'list')}" label="${message(code: 'default.list.label', args:[entityName])}"/>
    </z:hlayout>
</z:window>
</body>
</html>