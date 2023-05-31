# SI_2023_lab2_203238
2.Control Flow Graph: ![siCFG drawio (1)](https://github.com/marko41221/SI_2023_lab2_203238/assets/103193145/0f6ecc26-62f4-44be-b008-661c07189111)


----------------------------------------------------------------------------------------------------------------------------------

3.Ciklomatskata kompleksnost e presmetana so formulata P+1, kade P e brojot na predikatni jazli vo control flow graphot.
Imame 10 predikatni jazli, sto znaci deka ciklomatskata kompleksnost bi bila 11.


----------------------------------------------------------------------------------------------------------------------------------


4.Ni trebaat 5 test slucai za multiple condition, eden ke frli exception.

*1 Nema da imame username->ke frli exception
* 
*2 Ke postoi ednakov postoecki username, ke ima email koj sodzri @ i passwordot ke e validen spored golemina
* 
*3 Postoecki username,nepostoecki email,password koj ke bide pogolem od dozvolenata golemina, bez prazno mesto, bez da sodrzi username vo nego i bez prazno mesto.
*
*4 Usernameot nema da bide ednakov, emailot nema da sodrzi @ i nema da e ednakov, passwordot ke bide so prazno mesto i pogolem od dozvolenata golemina.
*
*5.Nema da postoi username, ke imame postoecki email koj ne sodrzi @ i passwordot ke e pogolem od dozbolenoto koj ke bide bez specijalni znaci i bez prazno mesto.


----------------------------------------------------------------------------------------------------------------------------------


5.(user==null || user.getPassword()==null || user.getEmail()==null

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

----------------------------------------------------------------------------------------------------------------------------------
