<%@ taglib uri="http://liferay.com/tld/aui" prefix="aui" %>
<input type="text" id="some-input" />
<span id="counter"></span> character(s) remaining

<aui:script>
YUI().use(
  'aui-char-counter',
  function(Y) {
    new Y.CharCounter(
      {
        counter: '#counter',
        input: '#some-input',
        maxLength: 10
      }
    );
  }
);
</aui:script>