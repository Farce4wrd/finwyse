import './App.css';
import {BrowserRouter, Route, Routes} from "react-router-dom";
import Layout from "./pages/Layout";
import Home from "./pages/Home";
import QuestionMenu from "./pages/Home";
function App() {
  return (
    <div className="App">
      <BrowserRouter>
              <Routes>
                  <Route path='/' exact={true} element={<Layout/>} />
                  <Route path='/questions/all' exact={true}  element={<Home/>}/>
                  <Route path={'/questions/question'} exact={true} element={<QuestionMenu/>}/>
              </Routes>
      </BrowserRouter>
    </div>
  );
}

export default App;
