<html>
   <head>
       <meta charset = "UTF-8"/>
   </head>

   <body>
       <form action = "user" method="POST" modelAttribute="userP">
           <table>
              <tr>
                   <td>UserName</td>
                   <td><input name="userName" type="text"/></td>
              </tr>
               <tr>
                   <td>Password</td>
                   <td><input name="password" type="password"/></td>

               </tr>
           </table>

           <input type="submit"/>
       </form>


   </body>

</html>