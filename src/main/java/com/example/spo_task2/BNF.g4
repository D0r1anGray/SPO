grammar BNF;

language: NACHALO (plenty)* (slag)* (oper)* KONETS EOF;

plenty: (PERVOE perem (ZAP perem)*) | (VTOROE numb+);

slag: numb (ZAP numb)* KONETS_SLAG;

oper: (numb DVOE)? perem RAVNO rightPart;

rightPart: (MINUS | PLUS)? part1 ((PLUS | MINUS) part1)*;

part1:  part2 ((UMNOZH | DELIT) part2)*;

part2: part3 ((AND | OR) part3)*;

part3: NOT? part4+;

part4: func | numb | perem;

//expression: rightPart ;

perem: PEREMEN;

func: (SIN | COS | TG) expression;

expression: numb|perem|func;

//operator: op=(MINUS | PLUS | UMNOZH | DELIT | AND | OR | NOT);

numb: NUMBER;



NUMBER: DIGIT+;

NACHALO: 'Íà÷àëî';
KONETS: 'Êîíåö';
PERVOE: 'Ïåğâîå';
VTOROE: 'Âòîğîå';
KONETS_SLAG: 'Êîíåö ñëàãàåìîãî';
ZAP: ',';
DIGIT: [0-7];
DVOE: ':';
RAVNO: '=';
MINUS: '-';
PLUS: '+';
UMNOZH: '*';
DELIT: '/';
AND: '&';
OR: '||';
NOT: 'íå';
LETTER: [À-ßà-ÿ];
SIN: 'sin';
COS: 'cos';
TG: 'tg';
PEREMEN: LETTER ((LETTER | NUMBER)+)?;
WS: [ \t\r\n]+ -> skip;

