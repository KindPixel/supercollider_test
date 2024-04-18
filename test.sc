// Création d'un synthétiseur basique qui joue un son sinusoïdal
(
SynthDef(\hello, {
    var freq = 440; // Fréquence du son (440 Hz pour un La)
    var dur = 1;    // Durée du son en secondes
    
    // Génération du son sinusoïdal
    var sound = SinOsc.ar(freq);
    
    // Envoi du son à la sortie audio
    Out.ar(0, sound);
}).add;
);

// Création d'une instance du synthétiseur et démarrage de la synthèse audio
{
    // Jouer le synthétiseur pendant 1 seconde
    Synth(\hello);
    1.wait;
}.fork;
