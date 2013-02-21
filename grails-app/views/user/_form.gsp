
<z:rows>

    <z:row>
        <z:label value="${message(code:'user.username.label',default:'Username')}"/>
        <z:textbox name="username" value="${userInstance?.username}" />
    </z:row>

    <z:row>
        <z:label value="${message(code:'user.password.label',default:'Password')}"/>
        <z:textbox name="password" value="${userInstance?.password}" />
    </z:row>

    <z:row>
        <z:label value="${message(code:'user.accountExpired.label',default:'Account Expired')}"/>
        <z:checkbox name="accountExpired" checked="${userInstance?.accountExpired}"/>
    </z:row>

    <z:row>
        <z:label value="${message(code:'user.accountLocked.label',default:'Account Locked')}"/>
        <z:checkbox name="accountLocked" checked="${userInstance?.accountLocked}"/>
    </z:row>

    <z:row>
        <z:label value="${message(code:'user.enabled.label',default:'Enabled')}"/>
        <z:checkbox name="enabled" checked="${userInstance?.enabled}"/>
    </z:row>

    <z:row>
        <z:label value="${message(code:'user.passwordExpired.label',default:'Password Expired')}"/>
        <z:checkbox name="passwordExpired" checked="${userInstance?.passwordExpired}"/>
    </z:row>

</z:rows>