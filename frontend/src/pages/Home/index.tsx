import Footer from "components/Footer";
import NavBar from "components/NavBar";
import { Link } from "react-router-dom";

function Home() {
    return (
        <>
            <NavBar />
            <div className="container">
                <div className="jumbotron">
                    <h1 className="display-4">Chambertran's Sales Feedback</h1>
                    <p className="lead">Take a look at yours sales results</p>
                    <hr />
                    <p>This app is a fictition sales results of the company Chambertran Solutions and intends for programming training only. It shows a dashboard that fatches data from a back end developed with Java and Spring Boot.</p>
                    <Link className="btn btn-primary btn-lg" to="/dashboard">
                        Sales Dashboard
                    </Link>
                </div>
            </div>
            <Footer />
        </>
    );
}

export default Home;