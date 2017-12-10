REVOKE ALL ON uni.Studenten FROM Nobody;
REVOKE ALL ON uni.Vorlesungen FROM Nobody;
REVOKE ALL ON uni.Assistenten FROM Nobody;
REVOKE ALL ON uni.Professoren FROM Nobody;
REVOKE ALL ON uni.hoeren FROM Nobody;
REVOKE ALL ON uni.voraussetzen FROM Nobody;
REVOKE ALL ON uni.pruefen FROM Nobody;

REM GRANT SELECT, INSERT, UPDATE ON uni.Studenten TO kemper, eickler;
REM GRANT SELECT, INSERT, UPDATE ON uni.Professoren TO kemper, eickler;
REM GRANT SELECT, INSERT, UPDATE ON uni.Assistenten TO kemper, eickler;
REM GRANT SELECT, INSERT, UPDATE ON uni.Vorlesungen TO kemper, eickler;
REM GRANT SELECT, INSERT, UPDATE ON uni.hoeren TO kemper, eickler;
REM GRANT SELECT, INSERT, UPDATE ON uni.voraussetzen TO kemper, eickler;
REM GRANT SELECT, INSERT, UPDATE ON uni.pruefen TO kemper, eickler;

GRANT SELECT, references, index ON uni.Studenten TO Nobody;
GRANT SELECT, references, index ON uni.Professoren TO Nobody;
GRANT SELECT, references, index ON uni.Assistenten TO Nobody;
GRANT SELECT, references, index ON uni.Vorlesungen TO Nobody;
GRANT SELECT, references, index ON uni.hoeren TO Nobody;
GRANT SELECT, references, index ON uni.voraussetzen TO Nobody;
GRANT SELECT, references, index ON uni.pruefen TO Nobody;
