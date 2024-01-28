const questions = [
    {
        question: "HTML se utiliza para:",
        answers: [
            { text: "Estilizar páginas web", correct: false},
            { text: "Estructurar el contenido de una página web", correct: true},
            { text: "Programar funciones interactivas en el navegador", correct: false},
            { text: "Crear consultas a bases de datos", correct: false},
        ]
    },
    {
        question: "¿Cuál de las siguientes etiquetas HTML se utiliza para crear un enlace?",
        answers: [
            { text: "a", correct: true},
            { text: "link", correct: false},
            { text: "nav", correct: false},
            { text: "url", correct: false},
        ]
    },
    {
        question: "En CSS, ¿cómo se selecciona un elemento por su clase?",
        answers: [
            { text: "#clase", correct: false},
            { text: "*clase", correct: false},
            { text: "/clase", correct: false},
            { text: ".clase", correct: true},
        ]
    },
    {
        question: "En CSS, ¿cómo se comenta un bloque de código?",
        answers: [
            { text: "// Comentario", correct: false},
            { text: "/* Comentario */", correct: true},
            { text: "!-- Comentario --", correct: false},
            { text: "# Comentario #", correct: false},
        ]
    },
    {
        question: "¿Qué significa CSS en el desarrollo web?",
        answers: [
            { text: "Creative Style Sheets", correct: false},
            { text: "Cascading Style Sheets", correct: true},
            { text: "Computer Style Sheets", correct: false},
            { text: "Colorful Style Sheets", correct: false},
        ]
    },
    {
        question: "En HTML, ¿cuál es la función de la etiqueta img?",
        answers: [
            { text: "Crear un enlace a otra página.", correct: false},
            { text: "Crear una lista ordenada", correct: false},
            { text: "Insertar una imagen", correct: true},
            { text: "Definir un párrafo de texto", correct: false},
        ]
    },
    {
        question: "¿Cuál es la etiqueta correcta para definir una lista desordenada en HTML?",
        answers: [
            { text: "ul", correct: true},
            { text: "ol", correct: false},
            { text: "li", correct: false},
            { text: "dl", correct: false},
        ]
    },
    {
        question: "¿Qué hace la propiedad display: none; en CSS?",
        answers: [
            { text: "Cambia el tamaño del elemento", correct: false},
            { text: "Aplica un borde al elemento", correct: false},
            { text: "Oculta el elemento", correct: true},
            { text: "Muestra el elemento como un bloque", correct: false},
        ]
    },
    {
        question: "¿Cuál es el selector universal en CSS?",
        answers: [
            { text: ".", correct: false},
            { text: "#", correct: false},
            { text: "*", correct: true},
            { text: "%", correct: false},
        ]
    },
    {
        question: "¿Qué significa HTML?",
        answers: [
            { text: "HyperText Markup Language", correct: true},
            { text: "Hyperlink and Text Markup Language", correct: false},
            { text: "High-level Text Management Language", correct: false},
            { text: "Home Tool Markup Language", correct: false},
        ]
    }
];

const questionElement = document.getElementById("question");
const answerButtons = document.getElementById("answer-buttons");
const nextButton = document.getElementById("next-btn");

let currentQuestionIndex = 0;
let score = 0;

function startQuiz(){
    currentQuestionIndex = 0;
    score = 0;
    nextButton.innerHTML = "Siguiente";
    showQuestion();
}

function showQuestion(){
    resetState();
    let currentQuestion = questions[currentQuestionIndex];
    let questionNo = currentQuestionIndex + 1;
    questionElement.innerHTML = questionNo + ". " + currentQuestion.question;

    currentQuestion.answers.forEach(answer => {
        const button = document.createElement("button");
        button.innerHTML = answer.text;
        button.classList.add("btn");
        answerButtons.appendChild(button);
        if(answer.correct){
            button.dataset.correct = answer.correct;
        }
        button.addEventListener("click", selectAnswer);
    });
}


function resetState(){
    nextButton.style.display = "none";
    while(answerButtons.firstChild){
        answerButtons.removeChild(answerButtons.firstChild);
    }
}

function selectAnswer(e){
    const selectedBtn = e.target;
    const isCorrect = selectedBtn.dataset.correct === "true";
    if(isCorrect){
        selectedBtn.classList.add("correct");
        score++;
    }else{
        selectedBtn.classList.add("incorrect");
    }
    Array.from(answerButtons.children).forEach(button => {
        if(button.dataset.correct === "true"){
            button.classList.add("correct");
        }
        button.disabled = true;
    });
    nextButton.style.display = "block";
}

function showScore(){
    resetState();
    questionElement.innerHTML = `Has acertado ${score} de ${questions.length}!`;
    nextButton.innerHTML = "Volver a intentar";
    nextButton.style.display = "block";
}

function handleNextButton(){
    currentQuestionIndex++;
    if(currentQuestionIndex < questions.length){
        showQuestion();
    }else{
        showScore();
    }
}


nextButton.addEventListener("click", ()=>{
    if(currentQuestionIndex < questions.length){
        handleNextButton();
    }else{
        startQuiz();
    }
});


startQuiz();