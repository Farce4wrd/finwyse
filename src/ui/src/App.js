import './App.css';
import {BrowserRouter, Route, Routes} from "react-router-dom";
import Layout from "./pages/Layout";
import Home from "./pages/Home";
function App() {
  return (
    <div className="App">
      <BrowserRouter>
              <Routes>
                  <Route path={'/'} component={<Layout/>} />
                  <Route path={'/questions/all'} component={<Home/>}/>
              </Routes>
      </BrowserRouter>
    </div>
  );
}

export default App;
