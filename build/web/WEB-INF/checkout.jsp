<form action="${initParam['urlpaypal']}" method="POST" target="_top">
    <input type="hidden" name="business" value="bdeg_xd@hotmail.com"/>
    <input type="hidden" name="return" value="${initParam['urlretorno']}"/> 
    <input type="hidden" name="cmd" value="_cart"/> 
    <input type="hidden" name="upload" value="1"/> 
    
    <c:forEach items="${cart}" var="pro">
        <c:set var="c" value="${c+1}"/>
        <input type="hidden" name="item_name_${c}" value="${pro.p.nombre}"/>
        <input type="hidden" name="item_number_${c}" value="${pro.p.webid}"/>
        <input type="hidden" name="amount_${c}" value="${pro.p.precio}"/>
        <input type="hidden" name="quanntity_${c}" value="${pro.cantidad}"/>
    </c:forEach>
    <input type="hidden" name="tax_cart" value="${total*0.19}"/>
    <input type="hidden" name="currency_code" value="${moneda}"/>
        <input type="image" src="https://www.sandbox.paypal.com/es_ES/ES/i/btn/btn_buynow_LG.gif" name="submit" alt="Paypal, la forma r�pida y segura de pagar en internet">
        <img alt="" src="https://www.sandbox.paypal.com/es_ES/i/scr/pixel.gif" width="1" height="1" />
</form>