import React, { useState, useEffect } from 'react';
import axios from 'axios';

const Home = () => {
    const [questions, setQuestions] = useState([]);
    const [currentQuestionIndex, setCurrentQuestionIndex] = useState(0);
    const [selectedOption, setSelectedOption] = useState('');
    const [showResult, setShowResult] = useState(false);

    useEffect(() => {
        const fetchData = async () => {
            try {
                console.log("Starting Fetch")
                const response = axios.get("/questions/all");
                 console.log(response.data);
                 setQuestions(response.data);
            } catch (error) {
                console.error('Error fetching questions:', error);
            }
        };
        fetchData().catch(e => {
            console.error('Error fetching questions:', e)
        });
    }, []);

    const handleOptionSelect = (option) => {
        setSelectedOption(option);
    };
    console.log(questions);

    const handleCheckAnswer = () => {
        setShowResult(true);
    };

    const handleNextQuestion = () => {
        setShowResult(false);
        setSelectedOption('');
        setCurrentQuestionIndex(currentQuestionIndex + 1);
    };

    const currentQuestion = questions[currentQuestionIndex];

    return (
        <div className="app-container">
            {currentQuestion && (
                <div className="question-container">
                    <div className="category">{currentQuestion.category}</div>
                    <h1 className="question">{currentQuestion.name}</h1>
                    <div className="options">
                        {currentQuestion.options.map((option, index) => (
                            <div
                                key={index}
                                className={`option ${showResult && selectedOption === option ? (option === currentQuestion['Correct Answer'] ? 'correct' : 'incorrect') : ''}`}
                                onClick={() => handleOptionSelect(option)}
                            >
                                {option}
                            </div>
                        ))}
                    </div>
                    <button className="check-button" onClick={showResult ? handleNextQuestion : handleCheckAnswer}>
                        {showResult ? 'Next' : 'Check'}
                    </button>
                    {showResult && (
                        <div className="metadata">
                            Metadata: <a href={currentQuestion.Metadata}>{currentQuestion.Metadata}</a>
                        </div>
                    )}
                </div>
            )}
        </div>
    );
};

export default Home;