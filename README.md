# Svømmeklubben "Delfinen"

Programmet her er et simpelt CLI-baseret organisationsprogram, designet til 
at kunne holde styr på en fiktiv svømmeklubs medlemmer og konkurrencedata.

## Interface

Når du starter programmet vil du blive mødt med en venlig introduktionsskærm, 
og 4 muligheder, seende således ud:
```
┌────────────────Main Menu────────────────┐
│»1: Show list of members                 │
│»2: Show Top 5 competitive swim times    │
│»3: Show Membership fees for all members │
│»10: Exit program                        │
└─────────────────────────────────────────┘
```
Du vælger herefter den ønskede funktion ved at taste det pågældene tal.

## Eksekvering af programmet

Jeg må ærligt indrømme at jeg endnu ikke ved hvordan jeg ville 
eksekvere programmet uden for IntelliJ. Java producerer ikke samme 
let-eksekverbare filer som "rigtige" systemkompilerede sprog gør,
og vi ender derfor med en __*abstrakt semi-virtualiseret binær-blob*__
som jeg endnu ikke ved hvordan håndteres.

Så du nøjes med at skulle bruge et monster af en IDE der sluger 2GB RAM 
for at køre et simpelt CLI-baseret program :P

## Program resourcer

Svømmeklubsmedlemmernes data ligger i mapperne herunder:

```
. Project_Dolphin
├── /src
├── /resources
│   ├── Memberlist.csv
│   └── /CompetitionTime
│       ├── 1.csv
│       ├── 2.csv
│       └── ...
└── ...
```

## Contact

* [@FrederikWVB - Frederik Wandall von Benzon](https://github.com/FrederikWVB)

## License

Opensource osv. MIT, GNU GPL, gør hvad der passer jer.

## Hej Claus

Håber det lever op til kravene.
