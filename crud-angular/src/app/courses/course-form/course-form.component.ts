import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup } from '@angular/forms';
import { MatSnackBar } from '@angular/material/snack-bar';

import { CoursesService } from './../services/courses.service';

@Component({
  selector: 'app-course-form',
  templateUrl: './course-form.component.html',
  styleUrls: ['./course-form.component.scss'],
})
export class CourseFormComponent implements OnInit {
  form: FormGroup;

  constructor(
    private formBuilder: FormBuilder,
    private service: CoursesService,
    readonly snackBar: MatSnackBar
  ) {
    this.form = this.formBuilder.group({
      name: [''],
      category: [''],
    });
  }

  ngOnInit(): void {}

  onSubmit() {
    this.service.save(this.form.value)
    .subscribe(result =>  console.log(result), () =>  this.onError());
  }

  private onError(){
this.snackBar.open('Erro ao salvar curso', 'Ok', { duration: 5000 });
  }

  onCancel() {
    this.form.reset();
  }
}
