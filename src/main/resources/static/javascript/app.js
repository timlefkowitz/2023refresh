const observer = new IntersectionObserver((entries,hidden) => {
    entries.forEach((entry) => {
        console.log(entry);
        if (entry.isIntersecting){
            entry.target.classList.add('show');
        } else {
            entry.target.classList.remove('show');
        }
    })
})

const hiddenElements = document.querySelectorAll('#sectionEffect');
hiddenElements.forEach((el) => observer.observe(el));
