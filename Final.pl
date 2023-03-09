color(red).
color(blue).
color(yellow).
color(black).

city(oradea).
city(zerind).
city(arad).
city(sibiu).
city(timisoara).
city(lugoj).
city(mehadia).
city(dobreta).
city(fagaras).
city(rimmicu_vilcea).
city(craiova).
city(pitesti).
city(bucharest).
city(giurgiu).
city(urziceni).
city(hirsova).
city(eforie).
city(vaslui).
city(lasi).
city(neamt).

hasColor(oradea, black).
hasColor(zerind, black).
hasColor(arad, black).
hasColor(sibiu, black).
hasColor(timisoara, black).
hasColor(lugoj, black).
hasColor(mehadia, black).
hasColor(doberta, black).
hasColor(fagaras, black).
hasColor(rimmicu_vilcea, black).
hasColor(craiova, black).
hasColor(pitesti, black).
hasColor(bucharest, black).
hasColor(giurgiu, black).
hasColor(urziceni, black).
hasColor(hirsova, black).
hasColor(eforie, black).
hasColor(vaslui, black).
hasColor(lasi, black).
hasColor(neamt, black).

nextTo(oradea,sibiu).
nextTo(oradea, zerind).
nextTo(arad, zerind).
nextTo(arad, sibiu).
nextTo(arad, timisoara).
nextTo(sibiu, oradea).
nextTo(sibiu, fagaras).
nextTo(sibiu, rimmicu_vilcea).
nextTo(timisoara, lugoj).
nextTo(lugoj, mehadia).
nextTo(mehadia, dobreta).
nextTo(dobreta, craiova).
nextTo(rimmicu_vilcea, pitesti).
nextTo(rimmicu_vilcea, craiova).
nextTo(fagaras, bucharest).
nextTo(craiova, pitesti).
nextTo(pitesti, bucharest).
nextTo(bucharest, urziceni).
nextTo(giurgiu, bucharest).
nextTo(urziceni, hirsova).
nextTo(urziceni, vasuli).
nextTo(hirsova, eforie).
nextTo(vaslui, lasi).
nextTo(lasi, neamt).

neighbors(X,Y):- nextTo(X,Y),!.
neighbors(X,Y):- nextTo(Y,X).

invalid(hasColor(_,_),[]):-fail.
invalid(hasColor(City1,Color1),[hasColor(City2,Color2)|_]):-
    neighbors(City1,City2),Color1=Color2,!.

invalid(hasColor(City,Color),[_|Rest]):-
    invalid(hasColor(City,Color),Rest).

solve([],[]).

solve([City|Rest],Solution):-color(Color),solve(Rest,Soll),
    \+invalid(hasColor(City,Color),Soll),
    Solution=[hasColor(City,Color)|Soll].

prolog_solution(Solution):-solve([arad,sibiu,fagaras,rimmicu_vilcea,craiova,pitesti,bucharest],Solution).
