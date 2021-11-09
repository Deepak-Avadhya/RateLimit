<html>
   <head>
      <meta content="text/html; charset=UTF-8" http-equiv="content-type">
   </head>
   <body class="c3">
      <p class="c1"><span class="c2">Traffic shaping</span></p>
      <p class="c0"><span class="c2"></span></p>
      <p class="c1"><span class="c2">Requirement:</span></p>
      <p class="c0"><span class="c2"></span></p>
      <p class="c1"><span class="c2">Create a framework that can throttle client requests in distributed systems. Throttling could be on multiple levels i.e per client, per endpoint etc. In case client limit has breached the framework should reject the request with appropriate http status. This framework can be included in any service to throttle client requests across all its instances.</span></p>
      <p class="c0"><span class="c2"></span></p>
      <p class="c0"><span class="c2"></span></p>
      <p class="c1"><span class="c2">Example:</span></p>
      <p class="c0"><span class="c2"></span></p>
      <p class="c1"><span class="c2">client: E-COM</span></p>
      <p class="c1"><span class="c2">&nbsp; &nbsp; &nbsp; limit:</span></p>
      <p class="c1"><span class="c2">&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;HOUR -&gt; 100</span></p>
      <p class="c1"><span class="c2">WEEK -&gt; 900</span></p>
      <p class="c1"><span class="c2">&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;MONTH &nbsp;-&gt; 10000</span></p>
      <p class="c1"><span class="c2">&nbsp; &nbsp; &nbsp; specialization:</span></p>
      <p class="c1"><span class="c2">&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; type: METHOD</span></p>
      <p class="c1"><span class="c2">&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;- GET :</span></p>
      <p class="c1"><span class="c2">&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;limit:</span></p>
      <p class="c1"><span class="c2">&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;SEC -&gt; 10</span></p>
      <p class="c1"><span class="c2">&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;MIN -&gt; 50</span></p>
      <p class="c1"><span class="c2">&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;WEEK -&gt; 700</span></p>
      <p class="c1"><span class="c2">&nbsp; &nbsp; &nbsp; &nbsp;- POST :</span></p>
      <p class="c1"><span class="c2">&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;limit:</span></p>
      <p class="c1"><span class="c2">&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;SEC -&gt; 20</span></p>
      <p class="c1"><span class="c2">&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;HOUR -&gt; 40</span></p>
      <p class="c1"><span class="c2">&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;WEEK -&gt; 900</span></p>
      <p class="c1"><span class="c2">&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;MONTH -&gt; 1000</span></p>
      <p class="c1"><span class="c2">type: API</span></p>
      <p class="c1"><span class="c2">&nbsp; &nbsp; &nbsp; &nbsp;- /status :</span></p>
      <p class="c1"><span class="c2">&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;limit:</span></p>
      <p class="c1"><span class="c2">&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;SEC -&gt; 20</span></p>
      <p class="c1"><span class="c2">&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;HOUR -&gt; 40</span></p>
      <p class="c1"><span class="c2">&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;WEEK -&gt; 900</span></p>
      <p class="c1"><span class="c2">&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;MONTH -&gt; 1000</span></p>
      <p class="c1"><span class="c2">&nbsp; &nbsp; &nbsp; &nbsp;- /pay :</span></p>
      <p class="c1"><span class="c2">&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;limit:</span></p>
      <p class="c1"><span class="c2">&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;SEC -&gt; 10</span></p>
      <p class="c1"><span class="c2">&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;MIN -&gt; 50</span></p>
      <p class="c1"><span class="c2">&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;WEEK -&gt; 700</span></p>
      <p class="c1"><span class="c2">PhonePe::MC Master Link</span></p>
      <p class="c1"><span class="c2">{&quot;mode&quot;:&quot;full&quot;,&quot;isActive&quot;:false}</span></p>
      <p class="c0"><span class="c2"></span></p>
   </body>
</html>
