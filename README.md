# SI_2023_lab2_203238
2.Control Flow Graph: ![Untitled Workspace](https://github.com/marko41221/SI_2023_lab2_203238/assets/103193145/4ccda963-6879-4d79-862c-1f3bb3d76504)
3.Ciklomatskata kompleksnost e presmetana so formulata P+1, kade P e brojot na predikatni jazli vo control flow graphot.
Imame 8 predikatni jazli, sto znaci deka ciklomatskata kompleksnost bi bila 9.
4.*If uslovot za (user==null || user.getPassword()==null || user.getEmail()==null) e true,ke dobieme RuntimeException
*If uslovot za (user==null || user.getPassword()==null || user.getEmail()==null) e false,ke prodolzime kon sledniot if uslov
*If uslovot vo user.getUsername()==null e true se dodava username na emailot
*If uslovot vo user.getUsername()==null e false kodot ke produzi kon sledniot del
*If uslovot vo user.getEmail().contains("@") && user.getEmail().contains(".") e false "same" ne se inkrementira
*If uslovot vo user.getEmail().contains("@") && user.getEmail().contains(".") e true zapocnuva loopot
*If uslovot za existingUser.getEmail() == user.getEmail() e false, "same" ne se inkrementira
*If uslovot za existingUser.getEmail() == user.getEmail() e true, "same" se inkrementira
*If uslovot za existingUser.getUsername() == user.getUsername() e false, "same" ne se inkrementira
*If uslovot za existingUser.getUsername() == user.getUsername() e true, "same" se inkrementira
*Passwordot go sodrzi usernameot ili  <8, dobivame false
*Passwordot ne go sodrzi usernameot, >8 i ne sodrzi nikakvo prazno mesto, kodot prodozluva
*Passwordot ne sodrzi nikakov specijalen znak, "same"!=0, dobivame false 
*Passwordot sodrzi barem eden specijalen znak, "same"!=0,dobivame same==0 i funkcijata vrakja true
5.(user==null || user.getPassword()==null || user.getEmail()==null)
Dokolku uslovite se rasporedeni vo bilo koi od ovie vrednosti, sekogas ke dobivame
RuntimeException
(TRUE,TRUE,TRUE)
(TRUE,FALSE,FALSE)
(TRUE,TRUE,FALSE)
(TRUE,FALSE,TRUE)
(FALSE,TRUE,TRUE)
(FALSE,TRUE,FALSE)
(FALSE,FALSE,TRUE)
Samo dokolku vrednosta za site niv e FALSE odnosno (FALSE,FALSE,FALSE) togas kodot ke prodolzi.
