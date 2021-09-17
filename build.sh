
rm *.class
java -Xmx500M org.antlr.v4.Tool -o ./melParse -package melParse mel.g4
cd melParse
rm *.class
javac mel*.java
cd ..
javac mel*.java
